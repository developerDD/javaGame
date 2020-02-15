package com.CodeWars;

public class InvertValues {
    public static int[] invert(int[] array){
        int[] arrayResalt=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>0){
                arrayResalt[i]=array[i]*(-1);
            }else{
                arrayResalt[i]=Math.abs(array[i]);
            }
        }
        return arrayResalt;
    }
}
