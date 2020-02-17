package com.CodeWars;

public class Strings {

    public static String RemoveFirstAndLastCharacter (String str){
        return str.substring(1, str.length() - 1);
    }
    // one number in string
    public static boolean isDigit(String s) {
        if(s.isEmpty()) return false;
        return s.matches("\\d{1}");
    }
    //del Space
    static String noSpace(final String x) {

        return new String (x.replaceAll("\\s",""));
    }

    public static String ReversedStrings(String str) {
        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse().toString();
    }

}
