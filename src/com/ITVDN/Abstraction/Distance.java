package com.ITVDN.Abstraction;

public class Distance implements IConvert{
    protected   double distance;

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public void print(){
        System.out.println("distance = " + distance);
    }

    public static class Convert{
        public static double convertMmToSm(double distanceInMM){
            return distanceInMM/10d;
        }
        public static double convertSmToMeter(double distanceInSM){
            return distanceInSM/100d;
        }
        public static double convertMeterToKilometer(double distanceInMeter){
            return distanceInMeter/1000d;
        }
        public static double convertKilometerToMile(double distanceInKilometer){
            return distanceInKilometer/1.68;
        }
    }
}
