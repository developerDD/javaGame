package com.CodeWars;

import java.util.Arrays;

/**
 * Счастливый год - это год, в котором только отдельные цифры (например, 2018) не повторяються
 */
public class NextHappyYear {
    static public int nextHappyYear(int year) {
        year++;//если текущий год имеет цифри ктоторые не повторяються
        boolean next = false;
        for (;;) {
            String str = Integer.toString(year);
            char[] num = str.toCharArray();
            Arrays.sort(num);
            for (int i = 1; i < num.length; i++) {
                if (num[i]==num[i-1]){
                    next=true;
                    break;
                }
            }
            if (next){
                year++;
                next=false;
            }else {
               return year;
            }
        }
    }
}
