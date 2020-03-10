package com.CodeWars;

/**
 * accum("abcd") -> "A-Bb-Ccc-Dddd"
 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
 */
public class Mumbling {
    public static String accum(String s) {
        // your code
        StringBuilder stringBuilder = new StringBuilder();
        String uperCase = s.toUpperCase();
        s=s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
           stringBuilder.append(uperCase.charAt(i));
            for (int j = 1; j < i+1; j++) {
                stringBuilder.append(s.charAt(i));
            }
            if (i==s.length()-1){
                break;
            }
            stringBuilder.append("-");
        }
        return stringBuilder.toString();
    }
}
