package com.chapt05.Builder;

public class SedanCar extends BuilderCars {
    @Override
    public void biuldModel() {
        car.setModel("BMW sedan");
    }

    @Override
    public void biuldMaxSpeed() {
        car.setMaxSpeed(200);
    }

    @Override
    public void biuldBrutto() {
        car.setBrutto(1500);
    }
}
