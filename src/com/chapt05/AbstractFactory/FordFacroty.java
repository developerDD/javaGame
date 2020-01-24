package com.chapt05.AbstractFactory;

public class FordFacroty implements CarsFactory {

    @Override
    public Sedan createSedan() {
        return new FordSedan();
    }

    @Override
    public Coupe createCoupe() {
        return new FordCoupe();
    }
}
