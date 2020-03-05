package com.CodeWars;

public class IrreducibleSumofRationals {
    public static  int nod(int a,int b) // для нахождения НОД
    {
        return b == 0 ? a : nod(b,a % b);
    }
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
        int NOD = nod(ZNAM,NOK);
        ZNAM/=NOD;
        NOK/=NOD;
        return NOK>2? "["+ZNAM+", "+NOK+"]":""+ZNAM;
    }
}
