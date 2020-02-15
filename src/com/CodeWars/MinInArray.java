package com.CodeWars;

import java.util.Arrays;

public class MinInArray {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
    public static String well(String[] x){
        int flag=0;
        for(String str: x){
            if (str=="good"){
                flag++;
            }
            if(flag==3){
                return"I smell a series!";
            }
        }
        if(flag==1||flag==2){
            return"Publish!";
        }else{
            return"Fail!";
        }
    }
}

