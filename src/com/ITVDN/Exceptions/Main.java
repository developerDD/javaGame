package com.ITVDN.Exceptions;

public class Main {
    public static void main(String[] args) {
//        int a;
//        int b;
//        String op;
//        Calc calc;
//        Scanner sc = new Scanner(System.in);
//        try {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            op = sc.next();
//            calc = new Calc(a, b);
//            calc.OperationCalc(op);
//            if (calc.isOk) {
//                System.out.println(calc.getResult());
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//            System.out.println(e.getCause());
//            System.out.println(e.getClass().getName());
//        } finally {
//            sc.close();
//        }
        Calc c1 = new Calc();
        c1.Action();

    }
}
