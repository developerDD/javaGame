import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationsString extends Exception {

    String[] masStr;
    int numberStr;

    public OperationsString(int number) {
        this.masStr = new String[number];
        numberStr = number;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Введите " + number + " слов. После каждого слова нажимайте Enter!");
            for (int i = 0; i < numberStr; i++) {
                masStr[i] = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String[] getMasStr() {
        return masStr;
    }

    public void setMasStr() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            for (int i = 0; i < numberStr; i++) {
                masStr[i] = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showMasStr() {
        try {
            for (String s :
                    masStr) {
                System.out.println(s + " size " + s.length());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //Ввести n строк с консоли, найти самую короткую и самую длинную
    //строки. Вывести найденные строки и их длину
    public void findMinMaxSrt() {
        int min = masStr[0].length();
        int max = 0;
        for (String str : masStr
        ) {
            if (str.length() > max) {
                max = str.length();
            }
            if (str.length() < min) {
                min = str.length();
            }
        }
        for (String str : masStr
        ) {
            if (str.length() == max) {
                System.out.println("Max " + str + " " + str.length());
            }

            if (str.length() == min) {
                System.out.println("Min " + str + " " + str.length());
            }

        }
    }

    /*Ввести n строк с консоли. Упорядочить и вывести строки в порядке
    возрастания (убывания) значений их длины.*/
    public void sortMasStr() {
        for (int i = 0; i < masStr.length; i++) {
            for (int j = i + 1; j < masStr.length; j++) {
                if (masStr[i].length() > masStr[j].length()) {
                    String temp = masStr[i];
                    masStr[i] = masStr[j];
                    masStr[j] = temp;
                }
            }
        }
    }
    /*Ввести n слов с консоли. Найти количество слов, содержащих только
    символы латинского алфавита, а среди них – количество слов с равным
    числом гласных и согласных букв.*/
    public void stringTocharLatino() {
        int flag = 0,count =0;
        for (int i = 0; i < masStr.length; i++) {
            flag=0;
            char[] wordChar = masStr[i].toCharArray();
            for (int j = 0; j < wordChar.length; j++) {
                if (wordChar[j] >= 'A' && wordChar[j] <= 'Z' || wordChar[j] >= 'a' && wordChar[j] <= 'z') {
                    flag ++;
                }
            }
            //проверка слова
            if (flag==masStr[i].length()) {
                System.out.println(masStr[i] + " только латинские буквы!");
                count++;
            }

        }
        System.out.println("Всего слов с латинскими буквами "+count);
    }
}
