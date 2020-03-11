package com.CodeWars;

/**
 * Examples:
 *
 * 1 - m = 371 -> 37 − (2×1) -> 37 − 2 = 35 ; thus, since 35 is divisible by 7, 371 is divisible by 7.
 *
 * The number of steps to get the result is 1.
 *
 * 2 - m = 1603 -> 160 - (2 x 3) -> 154 -> 15 - 8 = 7 and 7 is divisible by 7.
 *
 * 3 - m = 372 -> 37 − (2×2) -> 37 − 4 = 33 ; thus, since 33 is not divisible by 7, 372 is not divisible by 7.
 */
public class RuleOfDivisibilityBy7 {
    public static long[] seven(long m) {
        long count =0;
        long[] longs = new long[2];
        long num =0;
        while (String.valueOf(m).length()>2){
           num=m%10;
           m/=10;
           m-=(2*num);
           count++;
        }
        longs[0]=m;
        longs[1]=count;
        return longs;
    }
}
