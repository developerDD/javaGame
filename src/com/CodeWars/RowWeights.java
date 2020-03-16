package com.CodeWars;
/**
 * задача
 * Получив массив положительных целых чисел (веса людей) , верните новый массив / кортеж из двух целых чисел ,
 * где первое - это общий вес команды 1 , а второе - общий вес команды 2 .
 *  Примеры
 * rowWeights([13, 27, 49])  ==>  return (62, 27)
 * Пояснение :
 * Первый элемент 62 - это общий вес команды 1 , а второй элемент 27 - общий вес команды 2 .
 */
public class RowWeights {
    public static int[] rowWeights (final int[] weights)
    {
        int first =weights[0];
        int second =0;
        for (int i = 1; i < weights.length; i++) {
            if (i%2!=0){
                second+=weights[i];
            }else  {
                first+=weights[i];
            }
        }
        return new int[]{first, second}; // Do your magic!
    }
}
