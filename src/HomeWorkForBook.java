import com.CodeWars.*;


/**
 * @author Dima Derevianko
 */
public class HomeWorkForBook {

    public static void main(String[] args) {
        //int k = 2;
       // System.out.println(k << 3 >> k == k >> 1 << k);//разобраться
//            int [] numbers = {1,2,3,4,5,6,7,8,9,0};

        ///Test MateAcademy
        //System.out.println(ada("hfgsda"));
        //System.out.println(min(new int[]{1,13,-5}));
        //System.out.println(countOddPositionChars(new String[]{"Hello","world","from", "array"}));
        //System.out.println(hasNoneLetters("fabcde", "fgh"));
       //FromTheMinimum.minValue(new int[]{6, 7, 7, 7, 6, 6});
        System.out.println(JumpingNumber.jumpingNumber(4343456  ));
    }
    public static int sdd(String input){
        if (input==null||input.isEmpty()){
            return 0;
        }else {
            return input.length();
        }
}
    public static char ada(String input){
        return (char) Character.codePointAt(input.toCharArray(),input.length()-1);
}
    public static int min(int[] nums){
        if (nums.length==1||nums.length==0){
            return 0;
        }
    //Arrays.sort(nums);
    return nums[0];
}
    public static int countOddPositionChars(String[] array) {
        // WRITE YOUR CODE BELOW THIS LINE
        if (array.length==0){
            return 0;
        }
            int sum=0;
            for (int i = 0; i < array.length; i+=2) {
                    sum+=array[i].length();
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
                if (blacklist.charAt(i)==phrase.charAt(j)){
                    return false;
                }
            }
        }
        return true;
        // WRITE YOUR CODE ABOVE THIS LINE
    }
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


