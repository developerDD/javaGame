package com.CodeWars;

public class TipCalculator {

    public static Integer calculateTip(double amount, String rating){
        String review = rating.toLowerCase();
        double bablo = Math.ceil(amount);
        switch (review){
            case "terrible":
                return 0;
            case "poor":
               return (int) Math.ceil(bablo*5/100) ;
            case "good":
                return (int) Math.ceil(bablo*10/100);
            case "great":
                return (int) Math.ceil(bablo*15/100);
            case "excellent":
                return (int) Math.ceil(bablo*20/100);
            default:
                return null;
        }
    }
}
