package com.ITVDN.IteratorComparator;

public abstract class Car {
    // создать класс для компаратара и сомпереТО + повторить наследование иквелс хешКод
    private long numberBody;
    private String owner;
    private String model;
    private String color;
    private String typeBody;

    public Car(long numberBody, String owner, String model, String color, String typeBody) {
        this.numberBody = numberBody;
        this.owner = owner;
        this.model = model;
        this.color = color;
        this.typeBody = typeBody;
    }

    public abstract void move();
    public long getNumberBody() {
        return numberBody;
    }

    public String getOwner() {
        return owner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTypeBody() {
        return typeBody;
    }

    public void setTypeBody(String typeBody) {
        this.typeBody = typeBody;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }



}
