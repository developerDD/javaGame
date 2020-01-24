package com.chapt05.Builder;

public class CreateCars {
    public static Car buildCar(BuilderCars builderCars){
        builderCars.biuldBrutto();
        builderCars.biuldMaxSpeed();
        builderCars.biuldModel();
        return builderCars.getCar();
    }
}
