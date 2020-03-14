package com.CodeWars;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
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

    public static String[] stringToArray(String s){
        return s.split(" ");
    }

    static String encode(String word){
        word=word.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(5);
        int f = 0;
        for (int i = 0; i < word.length(); i++) {
            f=0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(i)==word.charAt(j)){
                    f++;
                }
            }
            if (f>1&&f!=0){
                stringBuilder.append(')');
            }else {
                stringBuilder.append('(');
            }
        }

        return stringBuilder.toString();
    }
    /*Write a function that will return the count of distinct case-insensitive alphabetic characters
     and numeric digits that occur more than once in the input string.
    The input string can be assumed to contain only alphabets (both uppercase and lowercase) and numeric digits.*/

    public static int duplicateCount(String text) {

        StringBuilder stringBuilder = new StringBuilder(text.toLowerCase());
        int duplicate = 0;
        boolean flag=false;
        for (int i = 0; i < stringBuilder.length()-1; i++) {
            if ('*'==stringBuilder.charAt(i)){
                continue;
            }else {
                for (int j = i+1; j < stringBuilder.length(); j++) {
                    if (stringBuilder.charAt(i)==stringBuilder.charAt(j)){
                        stringBuilder.replace(j,j+1,"*");
                        flag=true;
                    }
                }
                if (flag){
                    stringBuilder.replace(i,i+1,"*");
                    duplicate++;
                }
            }
            flag=false;
        }

        return duplicate;
    }

    public static String removeDuplicateWords(String s){
        String[] arr = s.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        HashSet<String> stringHashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (stringHashSet.contains(arr[i])){
                continue;
            }else {
                if (i>0)stringBuilder.append(" ");
                stringHashSet.add(arr[i]);
                stringBuilder.append(arr[i]);
            }

        }
        return stringBuilder.toString();
        //java 8 return Arrays.stream( s.split("\\s+")).distinct().collect(Collectors.joining(" ") );
    }

    /**
     * Usually when you buy something, you're asked whether your credit card number,
     * phone number or answer to your most secret question is still correct.
     * However, since someone could look over your shoulder, you don't want that shown on your screen.
     * Instead, we mask it.
     * Your task is to write a function maskify, which changes all but the last four characters into '#'.
     */
    public static String maskify(String str) {
        if (str.length()<4) return  str;
        String substring = str.substring(0,str.length()-4);
        String stringReplace =substring.replaceAll(".","#");
        stringReplace+=str.substring(str.length()-4,str.length());
        return stringReplace;
        //return str.replaceAll(".(?=.{4})", "#");
    }

    /**
     * Task:
     *  You have to write a function pattern which returns the following Pattern (See Pattern & Examples) upto n number of rows.
     *
     *  Note: Returning the pattern is not the same as Printing the pattern.
     *  Rules/Note:
     *  If n < 1 then it should return "" i.e. empty string.
     *  There are no whitespaces in the pattern.
     *  Pattern:
     *  (n)(n-1)(n-2)...4321
     *  (n)(n-1)(n-2)...432
     *  (n)(n-1)(n-2)...43
     *  (n)(n-1)(n-2)...4
     *  ...............
     *  ..............
     *  (n)(n-1)(n-2)
     *  (n)(n-1)
     *  (n)*/
    public static String pattern ( int n) {
        //Happy Coding ^_^
        if (n<1) return "";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i ; j--) {
                stringBuilder.append(j);
            }
            if (i!=n-1){
                stringBuilder.append('\n');
            }
        }
        return stringBuilder.toString();
}

    /**
     * Если задана строчная строка, состоящая только из буквенных символов и без пробелов,
     * вернуть наибольшее значение согласных подстрок. Согласные - это любые буквы алфавита, кроме "aeiou".
     *
     * Мы должны присвоить следующие значения: a = 1, b = 2, c = 3, .... z = 26.
     */
    public static int ConsonantValue(final String s){
        Map<Character, Integer> abcBook = new HashMap<>();
        String[] arr = s.split("[aeiou]");
        for (int i = 97, v =1; i < 123; i++,v++) {
            abcBook.put(Character.valueOf((char)i),v);
        }
        int sum =0,sumMax =0;
        char[] currentCharArr;
        char currentChar;
        for (int i = 0; i < arr.length; i++) {
            currentCharArr=arr[i].toCharArray();

            for (int i1 = 0; i1 < currentCharArr.length; i1++) {
                currentChar=currentCharArr[i1];

                for (Map.Entry<Character, Integer> item : abcBook.entrySet()) {
                    if (item.getKey()==currentChar){
                        sum+=item.getValue();
                        break;
                    }
                }
            }
            if (sum>sumMax){
                sumMax=sum;
                sum=0;
            }else {
                sum=0;
            }
        }

        return sumMax;
    }

}
