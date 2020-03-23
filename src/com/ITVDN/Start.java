package com.ITVDN;

import com.ITVDN.classAndObject.TypeEngines;
import com.ITVDN.classAndObject.Sedan;

public class Start {
    public static void main(String[] args) {
        Sedan bmw = new Sedan();
        Sedan bmw2 = new Sedan(2020,1500,"BMW","530LX",
                300,"BLACK","Leather","FellXXL");
        bmw2.setStateNumber(1235);
        TypeEngines disel = TypeEngines.DIESEL;
        TypeEngines benz = TypeEngines.BENZINE;
        System.out.println(benz);
        System.out.println(disel.getDescription());




    }
}
