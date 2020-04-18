package com.CodeWars;

import java.util.*;

public class MyLanguagesMAP {
    public static List<String> myLanguages(final Map<String, Integer> results) {
        TreeMap treeMap = new TreeMap();
        Object[] key = results.keySet().toArray();
        Object[] value = results.values().toArray();
        List<String> languages = new ArrayList<>();
        for (int i = key.length-1; i >=0; i--) {
            treeMap.put(value[i], key[i]);
        }

        key = treeMap.keySet().toArray();
        System.out.println(Arrays.toString(key));
        value=treeMap.values().toArray();
        System.out.println(Arrays.toString(value));

        for (int i = key.length-1; i >=0 ; i--) {
            if ((int)key[i]>=60){
                languages.add((String) value[i]);
            }
        }

        return languages;
    }
}
