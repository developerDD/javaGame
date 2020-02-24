package com.CodeWars;

public class ARuleOfDivisibilityBy13 {
    public static long thirt(long n) {
        int[] src = {1,10,9,12,3,4};
        int sum = 0,count =0,sum2=0;
       do{
            sum=0;
            while (n>0){
                if (count>5){
                    count=0;
                }
                sum+=n%10*src[count];
                n/=10;
                count++;
            }
            if (sum2==sum){
                break;
            }
           sum2=sum;
            n=sum;
            count=0;
       }while (true);
       return sum2;
    }
}
