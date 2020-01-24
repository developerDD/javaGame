package com.chapt05.Builder;

public class SportCar extends BuilderCars {
    @Override
    public void biuldModel() {
        car.setModel("BMW M8");
    }

    @Override
    public void biuldMaxSpeed() {
        car.setMaxSpeed(320);
    }

    @Override
    public void biuldBrutto() {
        car.setBrutto(1000);
    }
}
