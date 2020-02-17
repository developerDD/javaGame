import com.CodeWars.*;
import com.chapt05.Builder.Car;
import com.chapt05.Builder.CreateCars;
import com.chapt05.Builder.SedanCar;
import com.chapt05.Builder.SportCar;

import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.IntStream;

/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){
       int[] arr = {1,2,3,4,5,6};
       int[] res = divisibleBy(arr,2);
       for (int i: res){
           System.out.println(i);
       }

    }
    public static int[] divisibleBy(int[] numbers, int divider){
        String s = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]%divider==0){
                s+=String.valueOf(numbers[i]);
            }
        }
        int[] result = new int[s.length()];
        char[] arrChar =s.toCharArray();
        for (int i = 0; i < arrChar.length; i++) {
            result[i]= Integer.parseInt(String.valueOf(arrChar[i]));
        }
        return result;
    }
}


