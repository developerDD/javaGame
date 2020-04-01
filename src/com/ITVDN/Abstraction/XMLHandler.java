package com.ITVDN.Abstraction;

public class XMLHandler extends AbstractHandler {
    @Override
    public void open() {
        System.out.println("Open XML");
    }

    @Override
    public void change() {
        System.out.println("Change XML");
    }

    @Override
    public void save() {
        System.out.println("Save XML");
    }

    @Override
    public void create() {
        System.out.println("Create XML");
    }

}
