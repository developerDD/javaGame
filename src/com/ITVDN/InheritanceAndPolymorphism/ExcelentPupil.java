package com.ITVDN.InheritanceAndPolymorphism;

public class ExcelentPupil extends Pupil {
    public ExcelentPupil(String name, String nameClass) {
        super(name, nameClass);
    }

    @Override
    public void study() {System.out.println(super.toString()+" "+" I very like study!"); }

    @Override
    public void read() {
        System.out.println(super.toString()+" "+" I very like read!");
    }

    @Override
    public void write() {
        System.out.println(super.toString()+" "+" I very like write!");
    }

    @Override
    public void relax() {
        System.out.println(super.toString()+" "+" I not like relax!");
    }
}
