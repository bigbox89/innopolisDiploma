package com.github.apppetr.javaPractice.homework20;

/*  o001aa111|Camry|Black|133|82000
    o002aa111|Camry|Green|133|0
    o001aa111|Camry|Black|133|82000 */

public class Car {
    private String number;
    private String model;
    private String color;
    private int mileage;
    private int price;

    //создаем обьект автомобиль из строки в текстовом файле
    public Car(String line) {
        String[] userLine = line.split("\\|");
        this.number = userLine[0];
        this.model = userLine[1];
        this.color = userLine[2];
        this.mileage = Integer.parseInt(userLine[3]);
        this.price = Integer.parseInt(userLine[4]);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return number + "|" + model + "|" + color + "|" + mileage + "|" + price +  System.lineSeparator();
    }
}
