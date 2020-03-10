package com.CodeWars;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        //Code goes here!
        if (word.length()==1){
            return word;
        }else if(word.length()%2==0){
            return word.substring((word.length()/2)-1,(word.length()/2)+1);
        }else {
            return ""+word.charAt((word.length()/2));
        }
    }
}
