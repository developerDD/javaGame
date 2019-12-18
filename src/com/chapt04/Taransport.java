package com.chapt04;

abstract class Taransport {
    String engine;
    String wheel;
    String color;

    Taransport(String engine,String wheel,String color){
        this.engine=engine;
        this.wheel=wheel;
        this.color=color;
    }
    public abstract void move();
    public abstract void stop();
    public abstract void repair();
    public abstract void refuel();
}
