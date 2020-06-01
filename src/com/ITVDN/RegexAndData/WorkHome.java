package com.ITVDN.RegexAndData;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WorkHome {
    public static void main(String[] args) {
        System.out.println(replaceOnJava("dima.txt"));
    }

    public static String replaceOnJava(String nameFile){
        String regex = "\\sв\\s|\\sпро\\s|\\sу\\s|\\sдо\\s|\\sза\\s|\\sна\\s|\\sо\\s|\\sпо\\s|,на\\s";
        StringBuilder text = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(nameFile))) {
            String string;
            while ((string=br.readLine())!=null){
                text.append(string);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString().replaceAll(regex," Java ");
    }
}
