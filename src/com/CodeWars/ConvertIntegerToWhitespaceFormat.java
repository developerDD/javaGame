package com.CodeWars;

public class ConvertIntegerToWhitespaceFormat {
    public static String whitespaceNumber(final int n) {
        int k = n;
        int temp = k;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        if (k<0){
            k=k*(-1);
        }
        if (k==0){
            stringBuilder1.replace(0,1," ");
        }else{
            while (k!=0){
                stringBuilder.append(k%2);
                k/=2;
            }
            stringBuilder.reverse();

            if (temp<0){
                stringBuilder1.append('\t');//\t
            }else {
                stringBuilder1.append(' ');//\space
            }
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i)=='0'){
                    stringBuilder1.append(' ');
                }
                if (stringBuilder.charAt(i)=='1'){
                    stringBuilder1.append('\t');
                }
            }
        }
        stringBuilder1.append('\n');
        return stringBuilder1.toString();
    }
}
