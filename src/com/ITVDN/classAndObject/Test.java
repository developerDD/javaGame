package com.ITVDN.classAndObject;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {



        public static void main (String [] args) {
                ArrayList <Integer> num = new ArrayList<>();
                num.add(1);
                num.add(0,0);
                num.add(0,9);
                String j = Arrays.toString(num.toArray());
                j=j.replaceAll("[\\s \\[\\]]","");

                long p =1003;
                String k = String.valueOf(p);
                System.out.println(k.length());
        }
}
