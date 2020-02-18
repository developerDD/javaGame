package com.CodeWars;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c)
    {
        var r = Math.max(a+b+c,a*b*c);
        var r1 = Math.max(a*b+c,a*(b+c));
        var r2 = Math.max(a+b*c,(a+b)*c);
        return Math.max(r,Math.max(r1,r2));
    }
}
