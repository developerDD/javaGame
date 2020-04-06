package com.ITVDN.Abstraction;

public class Distance implements IConvert{
    protected static   double distance;

    public void setDistance(double distance) {
        this.distance = distance;

    }

    public void print(){
        System.out.println("distance = " + distance+" km to mile "+Distance.Convert.convertKilometerToMile()+"\n"+
                "distance = " + distance+" meter to kilometer "+Distance.Convert.convertMeterToKilometer()+"\n"+
                "distance = " + distance+" centimeter to meter "+Distance.Convert.convertSmToMeter()+"\n"+
                "distance = " + distance+" millimeter to centimeter "+Distance.Convert.convertMmToSm()+"\n");
    }

    public static class Convert{
        public static double convertMmToSm(){
            return distance/10d;
        }
        public static double convertSmToMeter(){
            return distance/100d;
        }
        public static double convertMeterToKilometer(){
            return distance/1000d;
        }
        public static double convertKilometerToMile(){
            return distance/1.68;
        }
    }


}
