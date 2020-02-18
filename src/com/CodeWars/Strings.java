package com.CodeWars;

import java.util.Arrays;
import java.util.stream.Stream;

public class Strings {

    public static String RemoveFirstAndLastCharacter (String str){
        return str.substring(1, str.length() - 1);
    }
    // one number in string
    public static boolean isDigit(String s) {
        if(s.isEmpty()) return false;
        return s.matches("\\d{1}");
        //поиск числа в строке //str[i].matches("^\\d*$")
    }
    //del Space
    static String noSpace(final String x) {

        return new String (x.replaceAll("\\s",""));
    }

    public static String ReversedStrings(String str) {
        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse().toString();
    }

    public static Object[] dbSort(Object[] a){
        int countNumber=0;
        int countWord=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] instanceof Number){
                countNumber++;
            }else {
                countWord++;
            }
        }
        int[] arrNumber = new  int[countNumber];
        String[] arrWord = new String[countWord];

        for (int i = 0,j=0,h=0; i < a.length; i++) {
            if (a[i] instanceof Number){
                arrNumber[j]=((Number) a[i]).intValue();;
                j++;
            }else {
                arrWord[h]=a[i].toString();
                h++;
            }
        }
        Arrays.sort(arrNumber);
        Arrays.sort(arrWord);
        Object[]result = new Object[countNumber+countWord];
        for (int i = 0,h=0; i < result.length; i++) {

            if (i<countNumber){
                result[i]=(Object)arrNumber[i];

            }else {
                result[i]=(Object)arrWord[h];
                h++;
            }
        }
        return result;


        //java 8
        /*return Stream.concat(
                Arrays.stream(a).filter((x)-> x instanceof Number).map((x)->(Number)x).sorted()
                ,Arrays.stream(a).filter((x)->x instanceof String).map((x)->(String)x).sorted()
        ).toArray();*/
    }

    /**
     *  /*
     *         * public static int toInt(Object obj)
     * {
     *     if (obj instanceof String)
     *     {
     *          return Integer.parseInt((String) obj);
     *     } else if (obj instanceof Number)
     *     {
     *          return ((Number) obj).intValue();
     *     } else
     *     {
     *          String toString = obj.toString();
     *          if (toString.matches("-?\d+"))
     *          {
     *               return Integer.parseInt(toString);
     *          }
     *          throw new IllegalArgumentException("This Object doesn't represent an int");
     *     }
     * }
     *         * */

    public static String twoSort(String[] s) {
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        StringBuffer buffer = new StringBuffer(s[0]);
        for (int i = 1,j=1; j <s[0].length(); i+=4,j++) {
            buffer.insert(i,"***");
        }
        //java 8 return String.join("***",s[0].split(""));
        return buffer.toString();
    }

}
