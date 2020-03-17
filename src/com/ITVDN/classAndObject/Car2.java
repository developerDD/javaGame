package com.ITVDN.classAndObject;

public class Car2 {
    private int year;
    private int white;
    private double speed;
    private String color;

    public Car2(int year) {
        this.year = year;
    }

    public Car2(){
        this(10);
        this.white = 2000;
        speed=250;
        color="Red";
    }
    public Car2(int year,int white,double speed){
        this("Green");
        this.year = year;
        this.white = white;
        this.speed = speed;
    }
    public Car2(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "year=" + year +
                ", white=" + white +
                ", speed=" + speed +
                ", color='" + color + '\'' +
                '}';
    }
}
