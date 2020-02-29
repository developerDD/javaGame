package com.CodeWars;

import java.util.Arrays;

/**
 * In this kata, you must create a digital root function.
 *
 * A digital root is the recursive sum of all the digits in a number.
 * Given n, take the sum of the digits of n. If that value has more than one digit,
 * continue reducing in this way until a single-digit number is produced.
 * This is only applicable to the natural numbers.
 */
public class SumOfDigitsRoot {
    public static int digital_root(int n) {
        int sum;
        int temp=n;
        do {
            sum=0;
            String numberString = String.valueOf(temp);
            char[] chars = numberString.toCharArray();
            int [] arrNumber = new int[numberString.length()];
            for (int i = 0; i < numberString.length(); i++) {
                arrNumber[i]=Character.getNumericValue(chars[i]);
                sum+=arrNumber[i];
            }
            System.out.println(sum);
            temp=sum;
        }while (String.valueOf(sum).length()!=1);
        return sum;
        //best  return (n != 0 && n%9 == 0) ? 9 : n % 9;
    }
}
