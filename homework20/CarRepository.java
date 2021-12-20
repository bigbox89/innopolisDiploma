package com.github.apppetr.javaPractice.homework20;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CarRepository {
    //Метод для считывания списка пользователей из файла
    Map<String, Car> getCarFromFile() throws FileNotFoundException {
        String inputFileName = "auto.txt";
        Map<String, Car> carsMap = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName))) {
            reader.lines().forEach(line -> {
                Car carsFromTxt = new Car(line);
                carsMap.put(carsFromTxt.getNumber(), carsFromTxt);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return carsMap;
    }
}
