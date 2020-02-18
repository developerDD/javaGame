package com.CodeWars;

import java.util.ArrayList;
import java.util.List;

public class SquareEveryDigit {
    public static int squareDigits(int n){
        StringBuilder stringBuilder = new StringBuilder();
        List<Integer> integerList = new ArrayList<>();
        while (n!=0){
           integerList.add(n%10);
            n/=10;
        }
        for (int i = integerList.size()-1; i >= 0; i--) {
            stringBuilder.append(integerList.get(i) *integerList.get(i));
        }
        return Integer.parseInt(stringBuilder.toString());
    }
}
