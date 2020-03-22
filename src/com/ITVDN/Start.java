package com.ITVDN;

import com.ITVDN.classAndObject.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        Sedan bmw = new Sedan();
        Sedan bmw2 = new Sedan(2020,1500,"BMW","530LX",
                300,"BLACK","Leather","FellXXL");
        NewCar newCar = new NewCar();
        System.out.println(bmw);
        System.out.println(bmw2);
        System.out.println(Sedan.getCountSedan());
        newCar.move();
        newCar.stop();
        bmw2.move();
        bmw2.stop();
      int[]i[]={{12,12},{12,15,}};
        System.out.println(i[1][1]);
    }
}
