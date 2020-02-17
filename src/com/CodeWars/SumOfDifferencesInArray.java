package com.CodeWars;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr){
        if (arr.length==1||arr.length==0)return 0;
        boolean oneElement=true;
        for (int i = 1; i <arr.length ; i++) {
                if (arr[i]!=arr[i-1]){
                    oneElement=false;
                    break;
                }
        }
        if (oneElement){
           return 0;
        }
        arr =IntStream.of(arr).boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
        int[] sumArr = new int[arr.length-1];
        for (int i = 1,j=0; i < arr.length; i++,j++) {
            sumArr[j]=arr[i-1]-arr[i];
        }
        int result = Arrays.stream(sumArr).sum();
        return result;
        //LOL  Arrays.sort(arr);
        //    return arr.length <= 1 ? 0 : arr[arr.length-1] - arr[0];
    }
}
