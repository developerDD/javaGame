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
        int flag = 0, count = 0, vowels = 0, vowelsWords = 0;
        for (int i = 0; i < masStr.length; i++) {
            flag = 0;
            vowels = 0;
            char[] wordChar = masStr[i].toCharArray();
            for (int j = 0; j < wordChar.length; j++) {
                if (wordChar[j] >= 'A' && wordChar[j] <= 'Z' || wordChar[j] >= 'a' && wordChar[j] <= 'z') {
                    flag++;
                }
                if ((wordChar[j] == 'A') || (wordChar[j] == 'E') || (wordChar[j] == 'I') || (wordChar[j] == 'O') || (wordChar[j] == 'U')
                        || (wordChar[j] == 'a') || (wordChar[j] == 'e') || (wordChar[j] == 'i') || (wordChar[j] == 'o') || (wordChar[j] == 'u')) {
                    vowels++;
                }
            }
            //проверка слова
            if (flag == masStr[i].length()) {
                System.out.println(masStr[i] + " только латинские буквы!");
                count++;
            }
            if (vowels == masStr[i].length() / 2) {
                vowelsWords++;
            }

        }
        System.out.println("Всего слов с латинскими буквами " + count);
        System.out.println("Всего слов с равным числом гласных и согласных букв " + vowelsWords);
    }

    /*Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке возрастания их кодов.
    Если таких слов несколько, найти первое из них*/
    public void lettersAscending() {
        int count = 1;
        for (int j = 0; j < masStr.length; j++) {
            for (int i = 1; i < masStr[j].length(); i++) {
                if (masStr[j].toCharArray()[i] > masStr[j].toCharArray()[i - 1]) {
                    count++;
                }
            }
            if (count == masStr[j].length()) {
                System.out.println("Cлово, символы в котором идут в строгом порядке возрастания их кодов " + masStr[j]);
                count = 1;
                break;
            }
        }
        if (count == 1) {
            System.out.println("Cлов, символы в котором идут в строгом порядке возрастания их кодов нет!");
        }
    }
}
