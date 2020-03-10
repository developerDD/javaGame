package com.CodeWars;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Return the number (count) of vowels in the given string.
 *
 * We will consider a, e, i, o, and u as vowels for this Kata.
 *
 * The input string will only consist of lower case letters and/or spaces.
 */
public class VowelCount {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        Pattern pattern = Pattern.compile("(?iu)[aeiou]");
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            vowelsCount++;
        }
        return vowelsCount;
    }
}
