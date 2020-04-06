package com.ITVDN.Abstraction;

public interface IConvert {
    double courseUAHtoUSD = 26.5;
    double courseUAHtoERO = 30;
    double oneMile = 1.68;
    double oneKilometer = 1000d;
    double oneMeter = 100d;
    double oneCentimeter = 10d;
    default double convertFromKilometerToMile(double kilometer){
        return kilometer/oneMile;
    }
    default double convertFromMeterToKilometer(double meter){
        return meter/oneKilometer;
    }
    default double convertCentimeterToMeter(double centimeter){
        return centimeter /oneMeter;
    }
    default double convertMillimeterToCentimeter(double millimeter){
        return millimeter / oneCentimeter;
    }

    default double convertUAHtoUSD(double UAH){
        return UAH/courseUAHtoUSD;
    }
    default double convertUAHtoERO(double UAH){
        return UAH/courseUAHtoERO;
    }
    default double convertUSDtoUAH(double USD){
        return USD*courseUAHtoUSD;
    }
    default double convertEROtoUAH(double ERO){
        return ERO*courseUAHtoERO;
    }
}
