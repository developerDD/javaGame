package com.ITVDN.CalculateReversePolish;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Calulate {
    private String inputString;
    private String[] numberFromInput;
    private String[] operatorsFromInput;
    private ArrayList<String> parsListFromInput;
    private ArrayList<String> polishList;
    private Stack<String> stackOperators;

    public Calulate(String inputString) {
        this.inputString = inputString;
        parsListFromInput=new ArrayList<>();
        polishList=new ArrayList<>();
        stackOperators =new Stack<>();
    }

    public void calculate(){
        parsInputStringtoArrays();
        createPolishList();
        showPolishList();
    }

    private void parsInputStringtoArrays(){
        numberFromInput = inputString.split("[\\+,\\-,\\*,\\/]");
        operatorsFromInput = inputString.split("\\d+");//перевый елемент массива пустой
        //формируем список из чисел и операторов
        for (int i = 0; i < numberFromInput.length; i++) {
            parsListFromInput.add(numberFromInput[i]);
            if (i!=numberFromInput.length-1) {
                parsListFromInput.add(operatorsFromInput[i + 1]);
            }
        }
    }

    private void createPolishList(){
        for (String s : parsListFromInput) {
            switch (s) {
                case "*":
                    if (stackOperators.isEmpty()){
                        stackOperators.push(s);
                        break;
                    }
                    if (stackOperators.peek().equals("/")||stackOperators.peek().equals("*")){
                        polishList.add(stackOperators.pop());
                        while (!stackOperators.isEmpty()){//добавлять в строку пока оператор равен или больше в приоритете
                            if(stackOperators.peek().equals("/")||stackOperators.peek().equals("*")){
                                polishList.add(stackOperators.pop());
                            }else {
                                break;
                            }
                        }
                        stackOperators.push(s);
                        break;
                    }
                    stackOperators.push(s);
                    break;
                case "+":
                    if (stackOperators.isEmpty()){
                        stackOperators.push(s);
                        break;
                    }
                    if (stackOperators.peek().equals("*")||stackOperators.peek().equals("/")
                            ||stackOperators.peek().equals("-")||stackOperators.peek().equals("+")){
                        polishList.add(stackOperators.pop());
                        while (!stackOperators.isEmpty()){
                            if(stackOperators.peek().equals("*")||stackOperators.peek().equals("/")
                                    ||stackOperators.peek().equals("-")||stackOperators.peek().equals("+")){
                                polishList.add(stackOperators.pop());
                            }else {
                                break;
                            }
                        }
                        stackOperators.push(s);
                        break;
                    }
                    stackOperators.push(s);
                    break;
                case "-":
                    if (stackOperators.isEmpty()){
                        stackOperators.push(s);
                        break;
                    }
                    if (stackOperators.peek().equals("*")||stackOperators.peek().equals("/")
                            ||stackOperators.peek().equals("+")||stackOperators.peek().equals("-")){
                        polishList.add(stackOperators.pop());
                        while (!stackOperators.isEmpty()){
                            if(stackOperators.peek().equals("*")||stackOperators.peek().equals("/")
                                    ||stackOperators.peek().equals("+")||stackOperators.peek().equals("-")){
                                polishList.add(stackOperators.pop());
                            }else {
                                break;
                            }
                        }
                        stackOperators.push(s);
                        break;
                    }
                    stackOperators.push(s);
                    break;
                case "/":
                    if (stackOperators.isEmpty()){
                        stackOperators.push(s);
                        break;
                    }
                    if (stackOperators.peek().equals("*")||stackOperators.peek().equals("/")){
                        polishList.add(stackOperators.pop());
                        while (!stackOperators.isEmpty()){
                            if(stackOperators.peek().equals("*")||stackOperators.peek().equals("/")){
                                polishList.add(stackOperators.pop());
                            }else {
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
        while (!stackOperators.isEmpty()){
            polishList.add(stackOperators.pop());
        }
    }

    public void showPolishList(){
        System.out.println(Arrays.toString(polishList.toArray()));
    }
}
