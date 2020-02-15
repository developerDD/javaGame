package com.CodeWars;

import java.util.Arrays;

public class MinInArray {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
}
