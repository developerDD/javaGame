package com.CodeWars;

/**
 * Definition
 * Jumping number is the number that All adjacent digits in it differ by 1.
 */

public class JumpingNumber {
    public static String jumpingNumber(int number){
        if (number<10){
            return "Jumping!!";
        }
        String numberStr = Integer.toString(number);
        boolean flag = true;
        int current = 0;
        int next = 0;
        for (int i = 1; i < numberStr.length(); i++) {
            current=Character.getNumericValue(numberStr.charAt(i));
            next=Character.getNumericValue(numberStr.charAt(i-1));
            if (current==next+1||current==next-1){
                continue;
            }
            flag=false;
            break;
        }
              return flag ? "Jumping!!": "Not!!";
    }
}
