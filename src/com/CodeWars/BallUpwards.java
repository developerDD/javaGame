package com.CodeWars;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BallUpwards {
    public static int maxBall(int v0) {
        // your code
        double time = (v0/3.6)/9.81;
        return (int)(new BigDecimal(time).setScale(1, RoundingMode.HALF_UP).doubleValue()*10);
    }
}
