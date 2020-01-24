package com.chapt05.AbstractFactory;

public class BMWFactory implements CarsFactory {
    @Override
    public Sedan createSedan() {
        return new BMWSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new BMWCoupe();
    }
}
