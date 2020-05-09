package com.CodeWars;

/**
 * Имея два целых числа aи b, которые могут быть положительными или отрицательными,
 * найти сумму всех чисел, включая их, и вернуть ее. Если два числа равны, верните a или b.
 * <p>
 * Примечание: a и bне заказаны!
 * <p>
 * Примеры
 * GetSum(1, 0) == 1   // 1 + 0 = 1
 * GetSum(1, 2) == 3   // 1 + 2 = 3
 * GetSum(0, 1) == 1   // 0 + 1 = 1
 * GetSum(1, 1) == 1   // 1 Since both are same
 * GetSum(-1, 0) == -1 // -1 + 0 = -1
 * GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
 */

public class SumOfNumbers {
    public static int GetSum(int a, int b) {
        int countBetweenAiB;
        if (a == b) {
            return a;
        } else {
            if (a > b) {
                int min = b;
                int max = a;
                countBetweenAiB = (max - min) + 1;
                return (int) (countBetweenAiB * ((min + max) / 2f));
            } else {
                countBetweenAiB = (b - a) + 1;
                return (int) (countBetweenAiB * ((a + b) / 2f));
            }
        }
    }
}
