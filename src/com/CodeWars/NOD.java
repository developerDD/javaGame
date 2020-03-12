package com.CodeWars;

/**
 * поиск НОД для двух чисел рекурсией и циклом
 */
public class NOD {
    public static int NODfindRecurtion(int a, int b){
        if (a%b==0){
            return b;
        }else {
            return NODfindRecurtion(b,a%b);
        }
    }

    public static int NODfindCikl(int a,int b){
        while (b!=0){
            b=a%(a=b);
        }
        return a;
    }
}
