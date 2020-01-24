package com.chapt05.Builder;

public class Car {
    private String model;
    private int maxSpeed;
    private int brutto;
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

        public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getBrutto() {
        return brutto;
    }

    public void setBrutto(int brutto) {
        this.brutto = brutto;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", brutto=" + brutto +
                '}';
    }

}
