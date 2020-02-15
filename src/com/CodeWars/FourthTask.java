package com.CodeWars;

import java.util.stream.IntStream;

public class FourthTask {
   public static int [] countMonky(final int number){
//       int [] arr = new int[number];
//       for (int i = 0; i <number ; i++) {
//           arr[i]=i+1;
//       }
//       return arr;
       return IntStream.rangeClosed(1,number).toArray();
   }

}
