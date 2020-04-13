package com.CodeWars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class DifferenceOf2InArray {
    /**
     * Цель состоит в том, чтобы вернуть все пары целых чисел из данной коллекции целых чисел,
     * которые имеют разность 2.
     * Результат должен быть отсортирован в порядке возрастания.
     * Вход будет состоять из уникальных значений.
     * Порядок целых чисел во входной коллекции не должен иметь значения.
     * @param array Вход из уникальных значений
     * @return
     * [1, 2, 3, 4]      -->  [[1, 3], [2, 4]]
     * [4, 1, 2, 3]      -->  [[1, 3], [2, 4]]
     * [1, 23, 3, 4, 7]  -->  [[1, 3]]
     * [4, 3, 1, 5, 6]   -->  [[1, 3], [3, 5], [4, 6]]
     */
    public static int[][] twosDifference(int[] array) {
        Arrays.sort(array);
        int [][] ints = new int[100][2];
        int rows=0;
        for (int i = 0; i < array.length; i++) {
            int finalI = i;
            if (IntStream.of(array).anyMatch(x->x==array[finalI]+2)){
                    ints[rows][0]=array[finalI];
                    ints[rows][1]=array[Arrays.binarySearch(array,array[finalI]+2)];
                rows++;
            }
        }
        int [][] arrayResult = new int [rows][2];
        arrayResult=Arrays.copyOf(ints,rows);
        return arrayResult;
    }
}
