package com.ITVDN.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
    private int a;
    private int b;
    private int result;
    private String operator;
    boolean isOk;

    public Calc() {

    }

    private void inputData() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Введите первый опереанд: ");
            a = sc.nextInt();
            System.out.print("Введите второй опереанд: ");
            b = sc.nextInt();
            System.out.print("Введите + - * / : ");
            operator = sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Введено не число!");
        }
    }

    private void OperationCalc() {
        try {
            switch (operator) {
                case "+":
                    result = a + b;
                    isOk = true;
                    break;
                case "-":
                    result = a - b;
                    isOk = true;
                    break;
                case "*":
                    result = a * b;
                    isOk = true;
                    break;
                case "/":
                    //1
                    // if (b==0)  throw new ArithmeticException();
                    //2
                    try {
                        result = a / b;
                        isOk = true;
                    } catch (Exception e) {
                        //System.out.println("/ by zero!!!");
                        //получение информации об исключении
                        System.out.println(e.getMessage());// конкретное какое
                        System.out.println(e.getClass().getName());// тип исключениея
                    }
                    break;
                default:
                    System.out.println("Error operation!");
            }
        } catch (Exception e) {
        }
    }

    public void Action() {
        inputData();
        OperationCalc();
        if (isOk) {
            System.out.println(a + operator + b + " = " + result);
        }
    }
}
