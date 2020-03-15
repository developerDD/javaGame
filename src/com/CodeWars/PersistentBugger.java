package com.CodeWars;

/**
 * Напишите функцию, persistenceкоторая принимает положительный параметр numи возвращает его мультипликативное постоянство,
 * которое является числом раз, когда вы должны умножить цифры, numпока не достигнете одной цифры.
 *
 * Например:
 *
 *  persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 *                       // and 4 has only one digit
 *
 *  persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 *                        // 1*2*6 = 12, and finally 1*2 = 2
 *
 *  persistence(4) == 0 // because 4 is already a one-digit number
 */
public class PersistentBugger {
    public static int countNumber( long n){
        if (n<10){
            return 0;
        }
        long multi = 1;
        long nextNumber =12;
        int count=0;
        while (String.valueOf(nextNumber).length()>1){
            while (n!=0){
                multi*=n%10;
                n/=10;
            }
            count++;
            nextNumber=multi;
            n=multi;
            multi=1;

        }
        return count;
    }
    //через рекурсию
    public static int persistence(long n) {
        long m = 1, r = n;

        if (r / 10 == 0)
            return 0;

        for (r = n; r != 0; r /= 10)
            m *= r % 10;

        return persistence(m) + 1;

    }
}
