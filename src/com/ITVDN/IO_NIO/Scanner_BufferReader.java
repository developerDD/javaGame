package com.ITVDN.IO_NIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Сканер и баферитРидер
 */
public class Scanner_BufferReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /**
         * System.in вводит байтовые значениея
         * int g = System.in.read();
         * если ввести симлов выведет числовое представление в аски коде
         * размер буфера Scanner (1024)
         */
        //что можно ввести
        int i = scanner.nextInt();
        float f = scanner.nextFloat();
        //считование слова до пробела
        String string = scanner.next();
        //считание всей строки
        String string1 = scanner.nextLine();
        //--------------------------------
        //создание в трай что бы автоматически закрылось (с джави 7 пришло)
        /**
         * InputStreamReader - считывет символы
         * BufferedReader - считывет текст и буферизирует его (размер его 8192)
         */
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))){
            String s = bufferedReader.readLine();//считать строку
            int num = Integer.parseInt(bufferedReader.readLine());// считать число
            System.out.println(s);
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
