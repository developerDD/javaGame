package com.CodeWars;

public class HalvingSum {
    /**
     *
     * @param n
     * @return 25  =>  25 + 12 + 6 + 3 + 1 = 47
     */
        int halvingSum(int n) {
            int sum = n;
            while(n!=0){
                n/=2;
                sum+=n;
            }
            return sum;
        }

}
