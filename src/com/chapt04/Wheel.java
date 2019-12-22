package com.chapt04;

enum TireType {winter, summer, allseasons, sport}

enum Manufacturer {Continental, Michelin, Goodyear, Pirelli}

public class Wheel {
    int radius;
    TireType tireType;
    Manufacturer manufacturer;

    public Wheel() {
        this.radius = (int) (Math.random() * (25 - 13)) + 13;
        TireType[] masTireType = TireType.values();
        Manufacturer[] masManufacturer = Manufacturer.values();
        this.tireType = masTireType[(0 + (int) (Math.random() * masTireType.length))];
        this.manufacturer = masManufacturer[(0 + (int) (Math.random() * masManufacturer.length))];
    }
    public Wheel(int radius){
        this.radius = radius;
        this.tireType=TireType.sport;
        this.manufacturer=Manufacturer.Michelin;
    }

    @Override
    public String toString() {
        return "Шины: " + manufacturer + ", radius - " + radius + ", typeGume - " + tireType + "\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() == obj.getClass()) {
            Wheel temp = (Wheel) obj;
            return this.manufacturer==temp.manufacturer &&
                    this.radius == temp.radius &&
                    this.tireType ==temp.tireType;
        } else
            return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
