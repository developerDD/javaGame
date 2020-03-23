package com.ITVDN.classAndObject;

import java.util.Objects;

public class NewCar {
    private final int year;
    private final int weigth;
    private final String marka;
    private final String model;
    private double speed;
    private String color;
    //нужно жобавить мотор, шаси, КПП

    public NewCar(){
        this.year = 0;
        this.weigth = 0;
        this.marka = "no marka";
        this.model = "no model";
        this.speed = 0.0;
        this.color = "no color";
    }

    public NewCar(double speed, String color) {
        this(1,1000,"no mark","no model");
        this.speed = speed;
        this.color = color;
    }

    public NewCar(int year, int weigth, String marka, String model) {
        this.year = year;
        this.weigth = weigth;
        this.marka = marka;
        this.model = model;
    }

    public NewCar(int year, int weigth, String marka, String model, double speed, String color) {
        this.year = year;
        this.weigth = weigth;
        this.marka = marka;
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public int getWeigth() {
        return weigth;
    }

    public double getSpeed() {
        return speed;
    }

    public String getColor() {
        return color;
    }
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public void move(){
        System.out.println("car is begin move!");
    }

    public void stop(){
        System.out.println("Car was stopping!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewCar newCar = (NewCar) o;
        return year == newCar.year &&
                weigth == newCar.weigth &&
                Double.compare(newCar.speed, speed) == 0 &&
                marka.equals(newCar.marka) &&
                model.equals(newCar.model) &&
                color.equals(newCar.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, weigth, marka, model, speed, color);
    }

    @Override
    public String toString() {
        return  "year   = " + year +
                ", weigth =" + weigth +
                ", marka ='" + marka + '\'' +
                ", model ='" + model + '\'' +
                ", speed =" + speed +
                ", color ='" + color + '\'';
    }
}
