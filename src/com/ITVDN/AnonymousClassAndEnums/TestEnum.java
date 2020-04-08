package com.ITVDN.AnonymousClassAndEnums;

public class TestEnum {
    public static void main(String[] args) {
        double mass = 105/Planet.EARTH.surfaceGravity();
        for (Planet p:Planet.values()){
            System.out.println("На планете "+p+" гравитация составляет "+p.surfaceGravity()+
                    " на этой планете Ваш вес соствит: "+p.surfaceWeight(mass));
        }

    }
}
