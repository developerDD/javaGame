package com.chapt05.Builder;

public abstract class BuilderCars {
    protected Car car = new Car();

    public Car getCar(){
        return car;
    }
    public abstract void biuldModel();
    public abstract void biuldMaxSpeed();
    public abstract void biuldBrutto();
}
