package com.CodeWars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Учитывая список цифр , вернуть наименьшее число , которые могут быть образованы из этих цифр, используя цифры только один раз (игнорировать дубликаты).
 *
 * Примечания:
 * Только положительные целые числа будут переданы функции (> 0), без отрицательных значений или нулей.
 * Input >> Output Примеры
 * minValue ({1, 3, 1})  ==> return (13)
 * Объяснение:
 * (13) - это минимальное число, которое можно сформировать из {1, 3, 1} , без дублирования
 *
 * minValue({5, 7, 5, 9, 7})  ==> return (579)
 * Объяснение:
 * (579) - это минимальное число, которое можно сформировать из {5, 7, 5, 9, 7} , без дублирования
 *
 * minValue({1, 9, 3, 1, 7, 4, 6, 6, 7}) return  ==> (134679)
 * Объяснение:
 * (134679) - это минимальное число, которое можно сформировать из {1, 9, 3, 1, 7, 4, 6, 6, 7} , без дублирования
 */

public class FromTheMinimum {
    public static int minValue(int[] values){
        Arrays.sort(values);
        Set<Integer> integerSet = new HashSet<Integer>();
        String number = "";
        for (int i : values){
            if (integerSet.add(i)){
                number+=i;
            }
        }
        return Integer.parseInt(number);
    }
}
