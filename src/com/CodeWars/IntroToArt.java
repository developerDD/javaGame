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
        if (height<2){
            return new    String[]{};
        }
        String [] art = new String[height];
        int sizeString = (height*2)+(height*2)-3;
        for (int i = 0; i < height; i++) {
            art[i]=new String();
        }
        String s = "";
        int start =0;
        int end =sizeString-1;
        int centre = end/2;
        int left =centre;
        int riaht = centre;
        for (int i = 0; i < height; i++,start++,end--,left--,riaht++) {
            for (int j = 0; j < sizeString; j++) {
                if (j==start||j==centre&&i==0||j==left||j==riaht||j==end){
                    s+="*";
                }else {
                    s+=" ";
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
