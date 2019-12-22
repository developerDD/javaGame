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
                "\nНомер автомобиля - " +numberCar+
                "\nДвигатель - " +engine+
                "\nЦвет - " +color+"\n"+ wheels.toString() ;
    }
    @Override
    public boolean equals(Object obj){
        if (obj==null)return false;
        if (this==obj)return true;
        if (getClass()==obj.getClass()){
            Car temp = (Car) obj;
            return color.equals(temp.color)&&engine.equals(temp.engine)&&
                    wheels.equals(temp.wheels)&&name.equals(temp.name)&&
                    type.equals(temp.type)&&numberCar.equals(temp.numberCar);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
