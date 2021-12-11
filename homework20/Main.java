package com.github.apppetr.javaPractice.homework20;

/*
Номера всех автомобилей, имеющих черный цвет или нулевой пробег. // filter + map
        Количество уникальных моделей в ценовом диапазоне от 700 до 800 тыс. // distinct + filter
        * Вывести цвет автомобиля с минимальной стоимостью. // min + map
        * Среднюю стоимость Camry *
*/

import java.io.IOException;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        CarRepository carsData = new CarRepository();
        System.out.println("Программа для работы с файлом пользователей");
        Map<String, Car> carsRepo = carsData.getCarFromFile();
        System.out.println(carsRepo);
        System.out.println("Номера всех автомобилей, имеющих черный цвет или нулевой пробег. // filter + map");
        System.out.println(carsRepo.entrySet().stream().filter(e ->
                e.getValue().getColor().equals("Black") || e.getValue().getMileage() == 0
        )
                .map(Map.Entry::getKey).collect(Collectors.toList()));
        System.out.println("------------");

        System.out.println("Количество уникальных моделей в ценовом диапазоне от 700 до 800 тыс. // distinct + filter");
        System.out.println(carsRepo.entrySet().stream()
                .distinct()
                .filter(e -> e.getValue().getPrice() < 800000 && e.getValue().getPrice() > 700000)
                .count());

        System.out.println("Вывести цвет автомобиля с минимальной стоимостью. // min + map");
        System.out.println(carsRepo.entrySet().stream()
                .min(Comparator.comparingInt(o -> o.getValue().getPrice()))
                .map(e -> e.getValue().getColor()));

        System.out.println("Средняя стоимость Camry");
        System.out.println(
                //считаем сумму стоимости всех Camry
                carsRepo.values().stream()
                        .filter(car -> car.getModel()
                                .equals("Camry")).map(Car::getPrice)
                        .mapToInt(i -> i).sum() /
                        //делим на количество автомобилей Camry
                        carsRepo.values().stream()
                                .map(Car::getModel)
                                .filter(model -> model.equals("Camry")).count()
        );
    }
}
