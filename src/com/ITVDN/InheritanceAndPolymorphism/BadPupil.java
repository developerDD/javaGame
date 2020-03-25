package com.ITVDN.InheritanceAndPolymorphism;

public class BadPupil extends Pupil {
    public BadPupil(String name, String nameClass) {
        super(name, nameClass);
    }

    @Override
    public void study() {
        System.out.println(super.toString() + " " + " I not like study!");
    }

    @Override
    public void read() {
        System.out.println(super.toString() + " " + " I not like read!");
    }

    @Override
    public void write() {
        System.out.println(super.toString() + " " + " I not like write!");
    }

    @Override
    public void relax() {
        System.out.println(super.toString() + " " + " I like relax!");
    }


}
