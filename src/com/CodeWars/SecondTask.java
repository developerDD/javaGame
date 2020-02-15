package com.CodeWars;

public class SecondTask {
    public static String Who_are_you (String name, String owner){
        if (name.equals(owner)){
            return  "Hello boss";
        }else {
            return "Hello guest";
        }
    }
}
