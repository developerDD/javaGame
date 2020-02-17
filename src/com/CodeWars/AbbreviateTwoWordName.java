package com.CodeWars;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        String result = new String();
        char p;
        for (String s:name.split(" ")){
             p=s.charAt(0);
             result += Character.toString(p);
        }
        StringBuffer stringBuffer = new StringBuffer(result);
        return stringBuffer.insert(1,".").toString().toUpperCase();
        // best
        // String[] names = name.split(" ");
        // return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
    }
}
