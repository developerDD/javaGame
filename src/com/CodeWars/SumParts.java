package com.CodeWars;

import java.util.Arrays;

/**
 * Давайте рассмотрим этот пример (массив записан в общем формате):
 *
 * ls = [0, 1, 3, 6, 10]
 *
 * Его следующие части:
 *
 * ls = [0, 1, 3, 6, 10]
 * ls = [1, 3, 6, 10]
 * ls = [3, 6, 10]
 * ls = [6, 10]
 * ls = [10]
 * ls = []
 * Соответствующие суммы (собраны в список): [20, 20, 19, 16, 10, 0]
 */

public class SumParts {
    public static int[] sumParts(int[] ls) {
        // your code
        int size = ls.length;
        int[] result = new int[size + 1];
        result[0] = Arrays.stream(ls).sum();
        int maxSum=result[0];
        for (int i = 1,k=0; i < size; i++,k++) {
            result[i]=maxSum-ls[k];
            maxSum=result[i];
        }
        return result;
    }
}
