package com.chapt04;

public class AirPlane extends Taransport {
    String name;
    String wings;
    String route;

    public AirPlane(String name, String engine, String wheel, String color, String wings, String route) {
        super(engine, wheel, color);
        this.name = name;
        this.wings = wings;
        this.route = route;
    }
    public void setRoute(String route){
        this.route=route;
    }
    public String getRoute() {
        return route+"\n";
    }

    @Override
    public void move() {
        System.out.println("Самолет полетел!");
    }

    @Override
    public void stop() {
        System.out.println("Самолет приземлился!");
    }

    @Override
    public void repair() {
        System.out.println("Самолет на ремонте!");
    }

    @Override
    public void refuel() {
        System.out.println("Самолет заправляеться!");
    }

    @Override
    public String toString() {
        return "AirPlane - " + name +
                "\nДвигатель: " + engine +
                "\nКолеса: " + wheel +
                "\nЦвет: " + color +
                "\nКрилья: " + wings +
                "\nМаршрут: " + route + "\n";
    }
}

