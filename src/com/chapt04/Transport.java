package com.chapt04;

import java.util.Objects;

abstract class Transport {
    String engine;
    String color;
    String wheel;

    Transport(String engine, String color, String wheel) {
        this.engine = engine;
        this.color = color;
        this.wheel = wheel;
    }

    public abstract void move();

    public abstract void stop();

    public abstract void repair();

    public abstract void refuel();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return Objects.equals(engine, transport.engine) &&
                Objects.equals(wheel, transport.wheel) &&
                Objects.equals(color, transport.color);
    }

    @Override
    public int hashCode() {

        return 31*(engine.hashCode() + wheel.hashCode() + color.hashCode());
    }
}
