package com.CodeWars;

public class GetChetnoeEvenNumber {
    public static int nthEven(int n){
       //line algoritm
        int flag=0;
        for (int i = 0,j=0; i <n; i++,j+=2) {
            if (i==(n-1))flag=j;
        }
        return flag;
        // n * 2 - 2 fast
    }
}
