package com.CodeWars;

/**
 *              1
 *           3     5
 *        7     9    11
 *    13    15    17    19
 * 21    23    25    27    29
 * Вычислить суммы строк этого треугольника из индекса строки (начиная с индекса 1), например:
 * rowSumOddNumbers(1); // 1
 * rowSumOddNumbers(2); // 3 + 5 = 8
 */
public class SumofoddnumbersTriangele {
    //построение каждой строки триугольника
    public static int rowSumOddNumbers(int n) {
        int sum=0;
        for (int i = 1,k=1; i < n+1; i++) {
            for (int j = 0; j < i; j++,k+=2) {
                if (i==n){
                    sum+=k;
                }
            }
        }
        return sum;
    }
    //сразу сумирование нужной строки
    // в строке находиться n не четных елементов, первый елемент следующей строки это
    // n*(n+1)+1 (+1 что бы сделатьне четность)
    public static int RowSumOddNumbers(int n) {
        --n;
        int firstElevtyn = n*(n+1)+1; // первый елемент следующей строки
        int sum=firstElevtyn;
        for (int i = 0; i < n; i++) {
            firstElevtyn+=2;
            sum+=firstElevtyn;
        }
        return sum;
    }
    // best
    // n*n*n :-)

}
