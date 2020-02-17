package com.CodeWars;

public class CountOfPositivesSumOfnegatives {
    public static int[] countPositivesSumNegatives(int[] input){
        int[] result;
        if (input==null){
            return result = new int[0];
        }else if(input.length==0){
            return result = new int[0];
        }  else{
            result =new int[2];
            int sumNegativ = 0;
            int countPositiv = 0;
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) countPositiv++;
                else sumNegativ += input[i];
            }
            result[0]=countPositiv;
            result[1]=sumNegativ;
        }
        return result;
        /*best
        *  if (input == null || input.length == 0) return new int[] {};
       int count = 0,sum = 0;
       for (int i : input) {
         if (i > 0) count ++;
         if (i < 0) sum += i;
       }
       return new int[] {count,sum};*/
    }
}
