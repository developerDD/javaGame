package com.chapt04;

import java.util.Objects;

public class AirPlane extends Transport {
    String name;
    String wings;
    String route;

    public AirPlane(String name, String engine, String wheel, String color, String wings, String route) {
        super(engine, color,wheel);
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
      @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AirPlane airPlane = (AirPlane) o;
        return Objects.equals(name, airPlane.name) &&
                Objects.equals(wings, airPlane.wings) &&
                Objects.equals(route, airPlane.route)&&
                Objects.equals(engine,airPlane.engine)&&
                Objects.equals(wheel,airPlane.wheel)&&
                Objects.equals(color,airPlane.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, wings, route);
    }
}

