package com.CodeWars;

import java.util.Arrays;

public class IrreducibleSumofRationals {
    public static String sumFracts(int[][] l) {
        // your code
        if(l.length==0){
            return null;
        }
        int [] chislitel = new int[l.length];
        int [] znaminatel = new int[l.length];
        for (int i = 0; i < l.length; i++) {
            chislitel[i]=l[i][0];
            znaminatel[i]=l[i][1];
        }
        int NOK =1;
        int TEMP = 0;
// поиск НОК
        for (int i = 0; i < znaminatel.length-1; i++) {
            TEMP = NOK;
            NOK=1;
            while(true){
                if (i==0){
                    if(NOK%znaminatel[i]==0&&NOK%znaminatel[i+1]==0){

                        break;
                    }
                }else {
                    if (NOK%TEMP==0&&NOK%znaminatel[i+1]==0){
                        break;
                    }

                }
                NOK++;
            }
        }
        int ZNAM = 0;
        for (int i = 0; i < chislitel.length; i++) {
            ZNAM+=chislitel[i]*(NOK/znaminatel[i]);
        }
        // сокращение дроби
        int count = 0;
        if (ZNAM>NOK){
            if (ZNAM%NOK==0){
                count=ZNAM/NOK;
            } else  {
                while (ZNAM%2!=1) {
                    ZNAM/=2;
                    NOK/=2;
                }
            }
        }
        int[][] arr = {{ZNAM,NOK}};
        return count!=0? String.valueOf(count): Arrays.toString(arr[0]);

    }
}
