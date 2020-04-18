package com.ITVDN.Generics;

public class MyClass<T> {
    public static <T> void factoryMethod(T t){
        System.out.println("t = " + t);
    }

    public static void main(String[] args) {
        MyClass.factoryMethod("Fefe");
    }
}

