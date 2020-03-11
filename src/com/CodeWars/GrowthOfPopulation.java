package com.CodeWars;

public class GrowthOfPopulation {
    public static int nbYear(int p0, double percent, int aug, int p) {
        // your code
        int count =0;
        while (p0<p){
        p0= (int) (p0+p0*(percent/100.0)+aug);
        count++;
        }
        return count;
    }
}
