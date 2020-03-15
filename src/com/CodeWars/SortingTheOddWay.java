package com.CodeWars;

import java.util.*;

/**
 * Учитывая массив чисел, сортируйте их таким образом,
 * чтобы все нечетные числа в массиве были отсортированы в порядке возрастания,
 * а четные числа отсортированы в порядке убывания после последнего нечетного числа.
 * Например, [1,2,3,4,5,6,7,8,9] производит продукцию [1,3,5,7,9,8,6,4,2].
 * Если массив содержит десятичные дроби, округлите их вниз, проверяя четность / нечетность.
 * На выходе должны быть оригинальные номера!
 */
public class SortingTheOddWay {
        public static Double[] sortItOut(Double[] array) {
            //your code
            List<Double> even = new ArrayList<>();
            List<Double> notEven = new ArrayList<>();
            Double temp =0d;
            for (int i = 0; i < array.length; i++) {
               temp=Math.floor(array[i]);

                if (temp%2==0){
                    even.add(array[i]);
                }else {
                    notEven.add(array[i]);
                }
            }
            Collections.sort(even);
            Collections.reverse(even);
            Collections.sort(notEven);
            notEven.addAll(even);
            Double[] res = new Double[notEven.size()];
            for (int i = 0; i < res.length; i++) {
                res[i]=notEven.get(i);
            }
            return res;
        }
}
