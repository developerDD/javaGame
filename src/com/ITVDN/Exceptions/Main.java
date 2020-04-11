package com.ITVDN.Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        String op;
        Calc calc = null;
        Scanner sc = new Scanner(System.in);
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            op = sc.next();
            calc = new Calc(a, b);
            calc.OperationCalc(op);
            if (calc.isOk) {
                System.out.println(calc.getResult());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass().getName());
        } finally {
            sc.close();
        }



    }
}
