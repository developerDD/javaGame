import com.CodeWars.*;

import java.util.Arrays;


/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args){
        String[] s = {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        Arrays.sort(s);
        System.out.println(Arrays.toString(s));
        StringBuffer buffer = new StringBuffer(s[0]);
        for (int i = 1,j=1; j <s[0].length(); i+=4,j++) {
            buffer.insert(i,"***");
        }
        System.out.println(buffer.toString());

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


