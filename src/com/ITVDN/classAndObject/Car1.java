package com.ITVDN.classAndObject;

public class Car1 {
    private int year;
    private int white;
    private double speed;
    private String color;

    public Car1(){
        System.out.println("Constructor without params");
    }

    public Car1(int year, int white, double speed, String color) {
        this.year = year;
        this.white = white;
        this.speed = speed;
        this.color = color;
    }

    public Car1(int year, int white, double speed) {
        this.year = year;
        this.white = white;
        this.speed = speed;
    }

    public Car1(int year, int white) {
        this.year = year;
        this.white = white;
    }

    public Car1(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car1{" +
                "year=" + year +
                ", white=" + white +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
