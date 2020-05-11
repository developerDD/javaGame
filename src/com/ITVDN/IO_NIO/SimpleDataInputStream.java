package com.ITVDN.IO_NIO;

import java.io.*;

public class SimpleDataInputStream {
    public static void main(String[] args) {
//        try (DataInputStream in = new DataInputStream(new FileInputStream("/home/ddfire/IdeaProjects/javaHomeWork/src/dima.txt"))) {
//           String da = in.readUTF();
//            System.out.printf("in.readUTF() = %s%n", da);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("dima.txt")));
             DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("dima.txt"))) ) {
            out.writeUTF("DIMA");
            out.flush();

            System.out.println(in.readUTF());

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}
