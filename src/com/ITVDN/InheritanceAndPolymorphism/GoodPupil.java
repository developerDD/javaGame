package com.ITVDN.InheritanceAndPolymorphism;

public class GoodPupil extends Pupil {
    public GoodPupil(String name, String nameClass) {
        super(name, nameClass);
    }

    @Override
    public void study() {
        System.out.println(super.toString()+" "+" I like study!");
    }

    @Override
    public void read() {
        System.out.println(super.toString()+" "+" I like read!");
    }

    @Override
    public void write() {
        System.out.println(super.toString()+" "+" I like write!");
    }

    @Override
    public void relax() {
        System.out.println(super.toString()+" "+" I like relax and study!");
    }
}
