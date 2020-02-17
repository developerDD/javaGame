package com.CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class DetectPangram {
    public static boolean check(String sentence){
        ArrayList<Character> abc = new ArrayList<>();
        ArrayList<Character> abc2 = new ArrayList<>();
        ArrayList<Character> strArr = new ArrayList<>();
        String str = sentence.toLowerCase();
        char[] arr = str.toCharArray();
        String abc1 = "abcdefghijklnmopqrstuvwxyz";
        for (char c:abc1.toCharArray()){
            abc.add(c);
            abc2.add(c);
        }
        for (char c:arr){
            strArr.add(c);
        }
        for (char chStr:strArr){
            for (char chABC:abc){
                if (chStr==chABC){
                    if (abc2.indexOf(chStr)!=-1){
                        abc2.remove(abc2.indexOf(chStr));
                        break;
                    }
                }
            }
        }
        if (abc2.isEmpty()){
            return true;
        }else{
            return false;
        }
        // best boolean check(String sentence){
        // for (char c = 'a'; c<='z'; c++)
        //            if (!sentence.toLowerCase().contains("" + c))
        //                return false;
        //        return true;}
    }
}
