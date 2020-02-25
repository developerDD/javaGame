import com.CodeWars.*;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args) {
        //int k = 2;
       // System.out.println(k << 3 >> k == k >> 1 << k);//разобраться
        int k = 0;
        int temp = k;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder1 = new StringBuilder();
        if (k<0){
            k=k*(-1);
         }
        if (k==0){
            stringBuilder1.replace(0,1," ");
        }else{
            while (k!=0){
                stringBuilder.append(k%2);
                k/=2;
            }
            stringBuilder.reverse();

            if (temp<0){
                stringBuilder1.append('\t');//\t
            }else {
                stringBuilder1.append(' ');//\space
            }
            for (int i = 0; i < stringBuilder.length(); i++) {
                if (stringBuilder.charAt(i)=='0'){
                    stringBuilder1.append(' ');
                }
                if (stringBuilder.charAt(i)=='1'){
                    stringBuilder1.append('\t');
                }

            }
        }
        stringBuilder1.append('\n');
        System.out.println(stringBuilder1.toString());

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


