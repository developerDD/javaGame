package com.ITVDN.IO_NIO;

import java.io.ByteArrayInputStream;

/**
 * Класс для считывания байтов
 */
public class byteArrayInputStream {
    public static void main(String[] args) {
        byte[] arr=new byte[]{1,2,3,4,5};
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arr);

        //вывод в консоль
        int data;
        while ((data = byteArrayInputStream.read())!=-1){
            System.out.println("data = " + data);   //1,2,3,4,5
        }
        //считать с определённого места определённое количество байт
        String str = "DIMA DD";
        byte[] arr1=str.getBytes();
        ByteArrayInputStream byteArrayInputStream1 = new ByteArrayInputStream(arr1,5,2);
        while ((data = byteArrayInputStream1.read())!=-1){
            System.out.println("data kod = " + data+" "+(char) data);   //код и символ D D
        }

    }
}
