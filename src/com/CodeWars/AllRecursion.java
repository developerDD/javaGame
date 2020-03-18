package com.CodeWars;

/**
 * all tasks for recursions
 */

public class AllRecursion {
    /**
     * Given a Divisor and a Bound , Find the largest integer N , Such That ,
     * * Conditions :
     * N is divisible by divisor
     * * N is less than or equal to bound
     * * N is greater than 0.
     * * Notes
     * The parameters (divisor, bound) passed to the function are only positve values .
     * It's guaranteed that a divisor is Found .
     */
    public static int maxMultiple(int divisor, int bound) {
        if (bound%divisor==0){
            return bound;
        }
        return maxMultiple(divisor,bound-1);
    }

    /**
     *  * josephus_survivor(7,3) => means 7 people in a circle;
     *  * one every 3 is eliminated until one remains
     *  * [1,2,3,4,5,6,7] - initial sequence
     *  * [1,2,4,5,6,7] => 3 is counted out
     *  * [1,2,4,5,7] => 6 is counted out
     *  * [1,4,5,7] => 2 is counted out
     *  * [1,4,5] => 7 is counted out
     *  * [1,4] => 5 is counted out
     *  * [4] => 1 counted out, 4 is the last element - the survivor!
     */
    public static int josephusSurvivor(final int n, final int k) {
        if(n == 1) {
            return 1;
        }
     
        return (josephusSurvivor(n - 1, k) + k - 1) % n + 1;

    }
}
