package com.ITVDN.Object;

public class Device {
    private final String manufacture;
    private final String serialNumber;
    private float price;

    public Device(String manufacture, String serialNumber, float price) {
        this.manufacture = manufacture;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public int hashCode(){
        int result = 14;
        result=31*result+manufacture.hashCode();
        result=31*result+serialNumber.hashCode();
        result=31*result+Float.floatToIntBits(price);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this==obj) return true;
        if (!(obj instanceof Device)) return false;
        Device ins = (Device) obj;
        return ins.manufacture.equals(manufacture)&&
                ins.serialNumber.equals(serialNumber)&&
                ins.price==price;
    }

    @Override
    public String toString() {
        return "Device: manufacture="+manufacture+", price="+price+", serialNumber= "+serialNumber;
    }
}
