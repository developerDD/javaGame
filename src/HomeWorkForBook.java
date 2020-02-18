import com.CodeWars.*;

import java.util.Arrays;


/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){
        System.out.println(       SquareEveryDigit.squareDigits(9119));

    }
    //
    public static int[] divisibleBy(int[] numbers, int divider){
        int[] divis = new int[numbers.length];
        int countElements=0;
        for (int i = 0,j=0; i < numbers.length; i++) {
            if (numbers[i]%divider==0){
                divis[j]=numbers[i];
                countElements++;
                j++;

            }
        }
        int[] result = new int[countElements];

        for (int i = 0; i < countElements; i++) {
            result[i]= divis[i];
        }
        return result;
    }
}


