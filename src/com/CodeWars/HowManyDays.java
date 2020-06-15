package com.CodeWars;

import java.util.Arrays;

public class HowManyDays {
    /**
     * Напишите функцию, которая получает список пар и возвращает количество дней,
     * в течение которых компания представлена ​​в другой стране. Первое число пары - это номер дня прибытия,
     * а второе число - день отъезда того, кто путешествует, т.е. 1 января - это номер 1, а 31 декабря - 365.
     * <p>
     * Пример:
     * <p>
     * daysRepresented (new int[][] {{10,17},{200,207}})
     * Возвращает 16, потому что есть две поездки по 8 дней, которые в сумме составляют 16.
     *
     * @param trips массив день приезда и день отезда
     * @return количество дней в стране
     */
    public static int daysRepresented(int[][] trips) {
        /* your code here */
        int arrival = 0;
        int depart = 0;
        int days = 0;
        int[] arr = new int[366];
        Arrays.fill(arr, 1);
        for (int i = 0; i < trips.length; i++) {
            arrival = trips[i][0];
            depart = trips[i][1];
            for (int j = arrival; j <= depart; j++) {
                if (arr[j] != 0) {
                    days++;
                    arr[j] = 0;
                }
            }
        }
        return days;
    }

}
