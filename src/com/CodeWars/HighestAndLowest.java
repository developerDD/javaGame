package com.CodeWars;

/**
 * In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.
 * highAndLow("1 2 3 4 5")  // return "5 1"
 * highAndLow("1 2 -3 4 5") // return "5 -3"
 * highAndLow("1 9 3 4 -5") // return "9 -5"
 */
public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        // Code here or
        String []   str = numbers.split(" ");
        int intmin = Integer.parseInt(str[0]);
        int intmax = Integer.parseInt(str[0]);
        for (int i = 1; i < str.length; i++) {
            if (Integer.parseInt(str[i])>intmax){
                intmax=Integer.parseInt(str[i]);
            }
            if (Integer.parseInt(str[i])<intmin){
                intmin=Integer.parseInt(str[i]);
            }
        }
        return intmax+" "+intmin;
    }
}
