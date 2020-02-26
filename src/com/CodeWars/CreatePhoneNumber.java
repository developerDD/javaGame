package com.CodeWars;

public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        String[] s = {"(", ")", " ", "-"};
        StringBuilder stringBuilder = new StringBuilder();
        int flag = 0;
        int flag1 = 0;
        for (int i = 0; i < 14; i++) {
            if (i == 0 || i == 4 || i == 5 || i == 9) {
                stringBuilder.insert(i, s[flag]);
                flag++;
                continue;
            } else {
                stringBuilder.insert(i, numbers[flag1]);
                flag1++;
            }
        }
        return stringBuilder.toString();
        //best return String.format("(%d%d%d) %d%d%d-%d%d%d%d",numbers[0],numbers[1],numbers[2],numbers[3],numbers[4],numbers[5],numbers[6],numbers[7],numbers[8],numbers[9]);
    }
}
