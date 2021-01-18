package com.CodeWars;



public class RegexpBasics {
    /**
     * Implement String#eight_bit_number?, which should return true if given object
     * is a number representable by 8 bit unsigned integer (0-255), false otherwise.
     * It should only accept numbers in canonical representation, so no leading +, extra 0s, spaces etc.
     */
    public static boolean eightBitNumber(String n) throws NumberFormatException {
        // Your code here
        try {
            Integer.parseInt(n);
            if (Integer.parseInt(String.valueOf(n.charAt(0)))==0&&n.length()!=1){
                return false;
            }
            if (Integer.parseInt(n)<0||Integer.parseInt(n)>255){
                return false;
            }
             }catch (NumberFormatException e){
            return false;
        }
        return true;
    }
}
