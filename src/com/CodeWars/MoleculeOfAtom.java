package com.CodeWars;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MoleculeOfAtom {
    public static Map<String,Integer> getAtoms(String formula) {
        // Your code here!
        HashMap<String,Integer> map = new HashMap<>();
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> arrNumber = new ArrayList<>();
        StringBuilder tempString = new StringBuilder("");

        for (int i = 0; i < formula.length(); i++) {
           if (Character.isLetter(formula.charAt(i))){
               tempString.append(String.valueOf(formula.charAt(i)));
           }else if (Character.isDigit(formula.charAt(i))){
               arrNumber.add(Integer.parseInt(String.valueOf(formula.charAt(i))));
               arr.add(tempString.toString());
               tempString.delete(0,tempString.length());
           }

        }
        for (int i = 0; i < arr.size(); i++) {
            map.put(arr.get(i),arrNumber.get(i));
        }
        for (Map.Entry<String , Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
        return map;
    }
}
