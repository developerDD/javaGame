package com.ITVDN.Exceptions;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a=0;
        int b=0;
        String op;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        op=sc.next();
        Calc calc = new Calc(a,b);
        calc.OperationCalc(op);
        if (calc.isOk){
            System.out.println(calc.getResult());
        }
        sc.close();

    }
}
