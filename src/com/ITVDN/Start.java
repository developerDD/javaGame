package com.ITVDN;

import com.ITVDN.classAndObject.*;

public class Start {
    public static void main(String[] args) {
        Sedan bmw = new Sedan();
        Sedan bmw2 = new Sedan(2020,1500,"BMW","530LX",
                300,"BLACK","Leather","FellXXL");
        System.out.println(bmw);
        System.out.println(bmw2);
        System.out.println(Sedan.getCountSedan());

    }
}
