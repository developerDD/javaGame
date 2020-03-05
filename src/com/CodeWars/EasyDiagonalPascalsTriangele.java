package com.CodeWars;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;

public class EasyDiagonalPascalsTriangele {
    public static BigInteger easyLine(int n, int p) {
        // your code
        BigInteger sum = BigInteger.valueOf(0);
        ArrayList<BigInteger> cerrent = new ArrayList<>();
        ArrayList<BigInteger> previous = new ArrayList<>(n);
        BigInteger firstLast = BigInteger.valueOf(1);
        int diagonal = p;
        for (int i = 1; i <= n + 1; i++) {
            for (int j = 0, index = 0; j < i; j++, index++) {
                if (j == 0 || j == i - 1) {
                    cerrent.add(firstLast);
                } else {
                    cerrent.add(previous.get(index).add(previous.get(index - 1)));
                }
                if (j == diagonal) {
                    sum = sum.add(cerrent.get(j));
                }
            }
            previous.clear();
            previous.addAll(0, cerrent);
            cerrent.clear();
        }
        return sum;
    }
}
