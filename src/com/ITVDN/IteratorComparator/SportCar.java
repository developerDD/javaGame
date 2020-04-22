package com.ITVDN.IteratorComparator;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class SportCar extends Car implements Comparable<SportCar>{
   private Float speed;
   private Double price;


    public SportCar(long numberBody, String owner, String model, String color, String typeBody, float speed, double price) {
        super(numberBody, owner, model, color, typeBody);
        this.speed = speed;
        this.price = price;
    }

    @Override
    public long getNumberBody() {
        return super.getNumberBody();
    }

    @Override
    public String getOwner() {
        return super.getOwner();
    }

    @Override
    public void setOwner(String owner) {
        super.setOwner(owner);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int hashCode() {
        int result=1;
        final int index = 31;
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return getOwner()+" "+getModel()+" "+getTypeBody()+" "+speed+" "+price;
    }

    @Override
    public void move() {
        System.out.println("Move SPORT CAR");
    }

    public float getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(@NotNull SportCar sportCar) {
      int temp = this.speed.compareTo(sportCar.speed);
      if (temp==0){
          return this.price.compareTo(sportCar.price);
      }else {
          return temp;
      }
    }
}
class Main{
    public static void main(String[] args) {
        SportCar s = new SportCar(123,"DD","S","red","f",236,2354.4);
        SportCar s1 = new SportCar(1233,"DDF","S","red","f",235,2354.5);
        SportCar s2 = new SportCar(1234,"DDC","S","red","f",235,2354.4);
        SportCar[] car = {s,s1,s2};
        Arrays.sort(car);
        for (SportCar sportCar : car) {
            System.out.println("sportCar = " + sportCar);
        }
    }
}