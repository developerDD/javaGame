package com.CodeWars;

import java.util.Arrays;

/**
 * It is known in advance that this year, the school chose the symmetric letter “W” as the object for the image,
 * and the only condition for its image is only the size that is not known in advance, so as training,
 * you need to come up with a way that accurately depicts the object.
 *
 * Write a function that takes an integer and returns a list of strings with a line-by-line image of the object.
 */
public class IntroToArt {
    public static String[] getW(int height) {
        if (height<3){
            return new    String[0];
        }
        String [] art = new String[height];
        int sizeStrig = (height*2)+(height*2)-3;
        for (int i = 0; i < height; i++) {
            art[i]=new String();
        }
        String s = "";
        int start =0;
        int end =sizeStrig-1;
        int centr = end/2;
        int left =centr;
        int riath = centr;
        for (int i = 0; i < height; i++,start++,end--,left--,riath++) {
            for (int j = 0; j < sizeStrig; j++) {
                if (j==start||j==centr&&i==0||j==left||j==riath||j==end){
                    s+="*";
                }else {
                    s+="t";
                }
            }
            art[i] = s;
            s="";
        }
        for (int i = 0; i < height; i++) {
            System.out.println(art[i]);
        }
        return art;
    }
}
