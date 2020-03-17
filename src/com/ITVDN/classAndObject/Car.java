package com.ITVDN.classAndObject;

public class Car {
    private int year;
    private String color;
    public Car(){
        System.out.println("Constructor without params");
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Color - "+color+", year - "+year;
    }
}
