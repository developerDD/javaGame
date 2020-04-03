package com.ITVDN.CalculateReversePolish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Calulate extends Exception {
    private String inputString;
    private double result;
    private String[] numberFromInput;
    private String[] operatorsFromInput;
    private ArrayList<String> parsListFromInput;
    private ArrayList<String> polishList;
    private Stack<String> stackOperators;


    public Calulate(String inputString) {
        this.inputString = inputString;
        parsListFromInput = new ArrayList<>();
        polishList = new ArrayList<>();
        stackOperators = new Stack<>();
    }

    public void calculate() throws Calulate {

        try {
            parsInputStringtoArrays();
            createPolishList();
            calculation();
            showPolishList();
        } catch (Calulate calulate) {
            System.out.println("No correct input!!!");
        }

    }

    private void parsInputStringtoArrays() throws Calulate {
        numberFromInput = inputString.split("[\\+,\\-,\\*,\\/]");
        operatorsFromInput = inputString.split("\\d+");//перевый елемент массива пустой
        //формируем список из чисел и операторов
        if (numberFromInput.length - (operatorsFromInput.length - 1) == 1) {
            for (int i = 0; i < numberFromInput.length; i++) {
                try {
                    Double.parseDouble(numberFromInput[i]);
                    parsListFromInput.add(numberFromInput[i]);
                    if (i != numberFromInput.length - 1) {
                        parsListFromInput.add(operatorsFromInput[i + 1]);
                    }
                } catch (Exception e) {
                    System.out.println(inputString + " -> not only numbers!!!");
                    throw new Calulate(inputString);
                }
            }
        } else {
            throw new Calulate(inputString);
        }
    }

    private void createPolishList() {
        for (String s : parsListFromInput) {
            switch (s) {
                case "*":
                    if (stackOperators.isEmpty()) {
                        stackOperators.push(s);
                        break;
                    }
                    if (stackOperators.peek().equals("/") || stackOperators.peek().equals("*")) {
                        polishList.add(stackOperators.pop());
                        while (!stackOperators.isEmpty()) {//добавлять в строку пока оператор равен или больше в приоритете
                            if (stackOperators.peek().equals("/") || stackOperators.peek().equals("*")) {
                                polishList.add(stackOperators.pop());
                            } else {
                                break;
                            }
                        }
                        stackOperators.push(s);
                        break;
                    }
                    stackOperators.push(s);
                    break;
                case "+":
                    if (stackOperators.isEmpty()) {
                        stackOperators.push(s);
                        break;
                    }
                    if (stackOperators.peek().equals("*") || stackOperators.peek().equals("/")
                            || stackOperators.peek().equals("-") || stackOperators.peek().equals("+")) {
                        polishList.add(stackOperators.pop());
                        while (!stackOperators.isEmpty()) {
                            if (stackOperators.peek().equals("*") || stackOperators.peek().equals("/")
                                    || stackOperators.peek().equals("-") || stackOperators.peek().equals("+")) {
                                polishList.add(stackOperators.pop());
                            } else {
                                break;
                            }
                        }
                        stackOperators.push(s);
                        break;
                    }
                    stackOperators.push(s);
                    break;
                case "-":
                    if (stackOperators.isEmpty()) {
                        stackOperators.push(s);
                        break;
                    }
                    if (stackOperators.peek().equals("*") || stackOperators.peek().equals("/")
                            || stackOperators.peek().equals("+") || stackOperators.peek().equals("-")) {
                        polishList.add(stackOperators.pop());
                        while (!stackOperators.isEmpty()) {
                            if (stackOperators.peek().equals("*") || stackOperators.peek().equals("/")
                                    || stackOperators.peek().equals("+") || stackOperators.peek().equals("-")) {
                                polishList.add(stackOperators.pop());
                            } else {
                                break;
                            }
                        }
                        stackOperators.push(s);
                        break;
                    }
                    stackOperators.push(s);
                    break;
                case "/":
                    if (stackOperators.isEmpty()) {
                        stackOperators.push(s);
                        break;
                    }
                    if (stackOperators.peek().equals("*") || stackOperators.peek().equals("/")) {
                        polishList.add(stackOperators.pop());
                        while (!stackOperators.isEmpty()) {
                            if (stackOperators.peek().equals("*") || stackOperators.peek().equals("/")) {
                                polishList.add(stackOperators.pop());
                            } else {
                                break;
                            }
                        }
                        stackOperators.push(s);
                        break;
                    }
                    stackOperators.push(s);
                    break;
                default:
                    polishList.add(s);
            }
        }
        while (!stackOperators.isEmpty()) {
            polishList.add(stackOperators.pop());
        }
    }

    private void calculation() {
        if (!stackOperators.isEmpty()) stackOperators.clear();
        double b, a;
        for (String s : polishList) {
            switch (s) {
                case "*":
                    b = Double.parseDouble(stackOperators.pop());
                    a = Double.parseDouble(stackOperators.pop());
                    stackOperators.push(a * b + "");
                    break;
                case "/":
                    b = Double.parseDouble(stackOperators.pop());
                    a = Double.parseDouble(stackOperators.pop());
                    stackOperators.push(a / b + "");
                    break;
                case "+":
                    b = Double.parseDouble(stackOperators.pop());
                    a = Double.parseDouble(stackOperators.pop());
                    stackOperators.push(a + b + "");
                    break;
                case "-":
                    b = Double.parseDouble(stackOperators.pop());
                    a = Double.parseDouble(stackOperators.pop());
                    stackOperators.push(a - b + "");
                    break;
                default:
                    stackOperators.push(s);
            }

        }
        result=Double.parseDouble(stackOperators.pop());
    }

    public void showPolishList() {
        if (!polishList.isEmpty()) {
            System.out.println(Arrays.toString(polishList.toArray()) + " result = "+ result);
        }
    }


}
