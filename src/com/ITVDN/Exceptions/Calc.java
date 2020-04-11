package com.ITVDN.Exceptions;

import org.jetbrains.annotations.NotNull;

public class Calc {
    private int a;
    private int b;
    private int result;
    boolean isOk;

    public Calc(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getResult() {
        return result;
    }

    public boolean isOk() {
        return isOk;
    }

    public void OperationCalc(@NotNull String op) throws ArithmeticException {
        switch (op) {
            case "+":
                result = a + b;
                isOk=true;
                break;
            case "-":
                result = a-b;
                isOk=true;
                break;
            case "*":
                result = a * b;
                isOk=true;
                break;
            case "/":
                //1
                // if (b==0)  throw new ArithmeticException();
                //2
                try {
                    result = a/b;
                    isOk=true;
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
    }
}
