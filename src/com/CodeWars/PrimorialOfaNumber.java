package com.CodeWars;
import java.math.BigInteger;

public class PrimorialOfaNumber {
    public static String numPrimorial(int n) {
        final int MAX = Integer.MAX_VALUE;
        int[] arrPrimoria = new int[n];
        int flag;
        int indexForArr=0;
        if (n==1) return "2";
        for (int i = 2; i < MAX; i++) {
            flag=0;
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if (i%j==0){
                    flag++;
                }
            }
            if (flag==1){
                arrPrimoria[indexForArr]=i;
                indexForArr++;
            }
            if (indexForArr==n){
                break;
            }
        }
        BigInteger multi = new BigInteger(String.valueOf(arrPrimoria[0]));
        for (int i = 1; i < n; i++) {
            multi=multi.multiply(BigInteger.valueOf(arrPrimoria[i])) ;

        }
        return String.valueOf(multi); // Do your magic!
    }
}
