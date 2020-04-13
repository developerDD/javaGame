package com.ITVDN.Object;

public class Monitor extends Device {
    private final int resolutionX;
    private final int resolutionY;


    public Monitor(String manufacture, String serialNumber, float price, int resolutionX, int resolutionY) {
        super(manufacture, serialNumber, price);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public int hashCode() {
        return super.hashCode()+resolutionY+resolutionX;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj)return true;
        if (!(obj instanceof Monitor)) return false;
        Monitor ins = (Monitor)obj;
        return super.equals(obj)&&
                ins.resolutionX==resolutionX&&
                ins.resolutionY==resolutionY;
    }

    @Override
    public String toString() {
        return super.toString()+", X="+resolutionX+",Y="+resolutionY;
    }
}
