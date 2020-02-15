package com.CodeWars;

import java.util.Arrays;
import java.util.stream.IntStream;

public class FifthTask {
    public static int[] map(int []arr){
        return Arrays.stream(arr).map(i->i*2).toArray();
    }
}
