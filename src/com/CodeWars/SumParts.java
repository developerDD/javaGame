package com.CodeWars;

import java.util.Arrays;

public class SumParts {
    public static int[] sumParts(int[] ls) {
        // your code
        int size = ls.length;
        int[] newArr = new int[size];
        int[] result = new int[size + 1];
        for (int i = 0; i < size; i++) {
            System.arraycopy(ls, i, newArr, 0, ls.length - i);
            result[i] = Arrays.stream(newArr).sum();
            Arrays.fill(newArr, 0);
        }
        return result;
    }
}
