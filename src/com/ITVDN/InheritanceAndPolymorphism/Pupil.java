package com.ITVDN.InheritanceAndPolymorphism;

public class Pupil {
    private final String name;
    String nameClass;

    public Pupil(String name, String nameClass) {
        this.name = name;
        this.nameClass = nameClass;
    }

    public String getName() {
        return name;
    }

    public void study() {
    }

    public void read() {
    }

    public void write() {
    }

    public void relax() {
    }

    @Override
    public String toString() {
        return "pupil name = '" + name + '\'' + ",pupil Class = '" + nameClass;
    }
}
