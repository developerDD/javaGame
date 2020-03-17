package com.CodeWars;

/**
 * В этой кате вы должны правильно указать, кто является «выжившим», то есть: последний элемент перестановки Иосифа .
 *
 * По сути, вы должны предположить, что n людей помещены в круг и что они исключаются в шагах из k элементов, например так:
 *
 * josephus_survivor(7,3) => means 7 people in a circle;
 * one every 3 is eliminated until one remains
 * [1,2,3,4,5,6,7] - initial sequence
 * [1,2,4,5,6,7] => 3 is counted out
 * [1,2,4,5,7] => 6 is counted out
 * [1,4,5,7] => 2 is counted out
 * [1,4,5] => 7 is counted out
 * [1,4] => 5 is counted out
 * [4] => 1 counted out, 4 is the last element - the survivor!
 */
public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
        int[] arr =new int[n];
        for (int i = 0; i <arr.length; i++) {
            arr[i] =i+1;
        }
        int size = arr.length;
        int indexDel=0;
        int countDed =0;
        while (true) {
            for (int i1 = 0; i1 < size; i1++) {
                if (countDed==size-1&&arr[i1]!=0){
                    return arr[i1];

                }
                if (arr[i1]!=0){
                    indexDel++;
                }
                if (indexDel==k&&arr[i1]!=0){
                    arr[i1]=0;
                    indexDel=0;
                    countDed++;

                }
            }
        }
    }
}
//best
// public static int josephusSurvivor(final int n, final int k) {
//    if(n == 1)
//      return 1;
//
//    return (josephusSurvivor(n - 1, k) + k - 1) % n + 1;
//  }
