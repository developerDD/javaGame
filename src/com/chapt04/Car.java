package com.chapt04;


public class Car extends Transport {
    String name;
    String type;
    String numberCar;
    Wheel wheels;

    public Car(String engine, String wheel, String color, String name, String type, String numberCar) {
        super(engine, color,wheel);
        this.name = name;
        this.type = type;
        this.numberCar = numberCar;
        this.wheels = new Wheel();
    }


    @Override
    public void move() {
        System.out.println("Машина едет!");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась!");
    }

    @Override
    public void repair() {
        System.out.println("Машина на ремонте!");
    }

    @Override
    public void refuel() {
        System.out.println("Машина на заправке!");
    }

    public void wheelsReplacement(){
        System.out.println("Меняем колса!");
    }
    @Override
    public String toString (){
        return "Автомобиль - "+name+
                "\nТип - " +type+
                "\nНомер автомобиля - " +numberCar+"\n"+
                wheels.toString() ;
    }
}
