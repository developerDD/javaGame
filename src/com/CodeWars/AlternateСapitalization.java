package com.CodeWars;

/**
 * Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
 * and return as shown below. Index 0 will be considered even.
 * For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF'].
 */

public class AlternateСapitalization {
    public static String[] capitalize(String s){
        // Gorillaz - Do Ya Thing (2010)
        String [] result = new String[2];
        StringBuilder stringBuilderEven = new StringBuilder();
        StringBuilder stringBuilderNotEven = new StringBuilder();
        int countEven=1;
        for (Character c:s.toCharArray()){
            if (countEven>=1&&countEven%2==0){
                stringBuilderNotEven.append(Character.toUpperCase(c));
                stringBuilderEven.append(c);
            }else {
                stringBuilderEven.append(Character.toUpperCase(c));
                stringBuilderNotEven.append(c);
            }
            countEven++;
        }
        result[0]=stringBuilderEven.toString();
        result[1]=stringBuilderNotEven.toString();
        return result;
    }
}
