import com.CodeWars.*;

import java.util.Arrays;
import java.util.HashSet;


/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){
    String string = "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta";
    String[] arr = string.split("\\s+");
    StringBuilder stringBuilder = new StringBuilder();
        HashSet<String> stringHashSet = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (stringHashSet.contains(arr[i])){
                continue;
            }else {
                if (i>0)stringBuilder.append(" ");
                stringHashSet.add(arr[i]);
                stringBuilder.append(arr[i]);
             }

        }
        stringBuilder.toString();



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


