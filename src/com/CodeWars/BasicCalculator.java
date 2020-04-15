package com.CodeWars;

public class BasicCalculator {
    public static Double calculate(final double numberOne, final String operation, final double numberTwo)
    {
        Double Result = null;
        // Show me the code!
        switch (operation){
            case "*":
                if (numberTwo==0)return 0d;
               return numberOne*numberTwo;
            case "/":
                if (numberTwo==0)return null;
                return numberOne/numberTwo;
            case "+":
                return numberOne+numberTwo;
            case "-":
                return numberOne-numberTwo;
            default:
                return null;
        }
    }
}
