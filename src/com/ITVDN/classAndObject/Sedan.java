package com.ITVDN.classAndObject;

public class Sedan extends NewCar {
    private final int bodyNumber;
    private int stateNumber;
    private static int countSedan;
    private String materialSalon;
    private String options;
    {
        countSedan++;
        bodyNumber =100000+31*123+countSedan;
    }
    public Sedan(){
        super();
        stateNumber=0;
        materialSalon ="Jeans.";
        options="No options.";
    }
    public Sedan(int year, int weigth, String marka, String model,
                 double speed, String color, String materialSalon, String options) {
        super(year, weigth, marka, model, speed, color);
        this.materialSalon = materialSalon;
        this.options = options;
    }

    public void setStateNumber(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    public void setMaterialSalon(String materialSalon) {
        this.materialSalon = materialSalon;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public int getBodyNumber() {
        return bodyNumber;
    }

    public int getStateNumber() {
        return stateNumber;
    }

    public static int getCountSedan() {
        return countSedan;
    }

    public String getMaterialSalon() {
        return materialSalon;
    }

    public String getOptions() {
        return options;
    }

    @Override
    public void move() {
        System.out.println("Car - "+getMarka() + " - "+getModel()+" GO!");
    }

    @Override
    public String toString() {
        return "Sedan ->" +
                "bodyNumber=" + bodyNumber +
                ", stateNumber=" + stateNumber +
                ", year ="+getYear()+
                ", weigth ="+getWeigth()+
                ", marka='" + getMarka() + '\'' +
                ", model='" + getModel() + '\'' +
                ", speed ="+getSpeed()+
                ", color ="+getColor()+
                ", materialSalon='" + materialSalon + '\'' +
                ", options='" + options + '\'' +
                '}';
    }
}
