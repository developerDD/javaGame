import com.CodeWars.MyLanguagesMAP;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dima Derevianko
 */

public class HomeWorkForBook {
    public static void main(String[] args) {
        //int k = 2;
        // System.out.println(k << 3 >> k == k >> 1 << k);//разобраться
        /** операнд1 << or >> операнд2 (операнд2 всегда 2 в стпенени операнда)
         * если << то умножение, если >> то диление!!!
         * вычесляем с лево от == k << 3 >> k
         * начинаем с лева:
         * k << 3 = 2*2 (в степени 3) = 2*8 = 16
         * 16 >> k= 16/2 (в степени 2) = 16/4 = 4
         * k << 3 >> k = 4
         * вычесляем с право от == k >> 1 << k
         * k >> 1 = 2/2 (в степени 1) = 2/2= 0
         * 0 << k =0*2 (в степени 2) = 0*4 = 4
         * результат k << 3 >> k == k >> 1 << k будет TRUE 4==4
         */
        //MateAcademy
        ///Test MateAcademy
        //System.out.println(ada("hfgsda"));
        //System.out.println(min(new int[]{1,13,-5}));
        //System.out.println(countOddPositionChars(new String[]{"Hello","world","from", "array"}));
        //System.out.println(hasNoneLetters("fabcde", "fgh"));
        //FromTheMinimum.minValue(new int[]{6, 7, 7, 7, 6, 6});
        //System.out.println(JosephusSurvivor.josephusSurvivor(40,3));
//      привышено время List<Object> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
//        List<Object> newList = JosephusPermutation.josephusPermutation(list,2);
//        for (var string :newList){
//            System.out.printf(string.toString());
//        }
//        int [] a = {1,2,3,4,9};
//        int f = 9;
//        boolean b = IntStream.of(a).anyMatch(x->x==f);
//        System.out.println(b);
//        System.out.println(Arrays.binarySearch(a,9));
        Map<String, Integer> map2 = new HashMap<>();
        map2.put("Hindi", 60);
        map2.put("Dutch", 93);
        map2.put("Greek", 71);
        map2.put("GDDDD", 71);
        MyLanguagesMAP.myLanguages(map2);
    }
    //сумирование без +
    public static int add(int a, int b)	{
        if (b == 0) return a;
        int sum = a ^ b;			// добавляем без переноса
        int as = a&b;
        int carry = (a & b) << 1;	// перенос без суммирования
        return add(sum, carry);		// рекурсия
    }


    public static char ada(String input) {
        return (char) Character.codePointAt(input.toCharArray(), input.length() - 1);
    }

    public static int min(int[] nums) {
        if (nums.length == 1 || nums.length == 0) {
            return 0;
        }
        //Arrays.sort(nums);
        return nums[0];
    }

    public static int countOddPositionChars(String[] array) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (array.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            sum += array[i].length();
        }
        return sum;
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    private static boolean hasNoneLetters(String blacklist, String phrase) {
        // WRITE YOUR CODE BELOW THIS LINE
        blacklist = blacklist.toLowerCase();
        phrase = phrase.toLowerCase();
        for (int i = 0; i < blacklist.length(); i++) {
            for (int j = 0; j < phrase.length(); j++) {
                if (blacklist.charAt(i) == phrase.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
        // WRITE YOUR CODE ABOVE THIS LINE
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        int[] divis = new int[numbers.length];
        int countElements = 0;
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                divis[j] = numbers[i];
                countElements++;
                j++;

            }
        }
        int[] result = new int[countElements];

        for (int i = 0; i < countElements; i++) {
            result[i] = divis[i];
        }
        return result;
    }
}


