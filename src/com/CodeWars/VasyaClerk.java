package com.CodeWars;

public class VasyaClerk {
    public static String Tickets(int[] peopleInLine) {
        int dolar25=0;
        int dolar50=0;
        int dolar100=0;

        for (int i : peopleInLine) {
            switch (i) {
                case (25):
                    dolar25++;
                    break;
                case (50):
                   if (dolar25>0){
                       dolar50++;
                       dolar25--;
                       break;
                   }else {
                       return "NO";
                   }
                case (100):
                   if (dolar25>0&&dolar50>0){
                       dolar100++;
                       dolar25--;
                       dolar50--;
                   }else if (dolar25>=3&&dolar50==0){
                       dolar100++;
                       dolar25-=3;
                   }else {
                       return "NO";
                }
            }
        }
        return "YES";
    }
}


