package com.CodeWars;

import java.util.*;

public class MyLanguagesMAP {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        TreeMap treeMap = new TreeMap(results);
        Object[] strings = treeMap.keySet().toArray();
        Object[] collection = treeMap.values().toArray();
        List<String > languages = new ArrayList<>();
        for (int i = strings.length-1; i >=0 ; i--) {
            if((int)collection[i]>=60){
                languages.add((String) strings[i]);
            }else {
                break;
            }
        }
        return languages;
    }
}
