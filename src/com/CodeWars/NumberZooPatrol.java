package com.CodeWars;

import java.util.Arrays;

public class NumberZooPatrol {
    /**
     * Напишите функцию, которая принимает перетасованный список уникальных чисел из 1 в n где
     * отсутствует один элемент (который может быть любым числом, включая n). Верните этот пропущенный номер.
     * Примечание : огромные списки будут проверены.
     * Примеры:
     * [1, 3, 4]  =>  2
     * [1, 2, 3]  =>  4
     * [4, 2, 3]  =>  1
     */
    public static int findMissingNumber(int[] numbers) {
        // TODO replace with your code
        long lastNumber = numbers.length+1;
        long sumAllNumber=lastNumber*(lastNumber+1)/2; // формула поиска суммы от 1 до числа lastNumber
        long sum = Arrays.stream(numbers).sum();
        return (int) ((int)sumAllNumber-sum);
    }
}
