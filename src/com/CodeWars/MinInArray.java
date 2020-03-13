package com.CodeWars;

import java.util.Arrays;

public class MinInArray {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }
    public static String well(String[] x){
        int flag=0;
        for(String str: x){
            if (str=="good"){
                flag++;
            }
            if(flag==3){
                return"I smell a series!";
            }
        }
        if(flag==1||flag==2){
            return"Publish!";
        }else{
            return"Fail!";
        }
    }

    /**
     * Учитывая в массив / список [] из п целых чисел , организовать их таким образом , аналогично с возвратно -поступательным движением маятника
     *
     * Наименьший элемент списка целых чисел должен занимать центральное положение массива / списка .
     *
     * Выше, чем самый маленький , идет направо .
     * Следующее более высокое число идет слева от минимального числа и т. Д., Время от времени, аналогично маятнику.
     */
    public static int[] pendulum(final int[] values) {
        int [] dinDon = new int[values.length];
        Arrays.sort(values);
        int centralIndex = (values.length-1)/2;
        dinDon[centralIndex]=values[0];
        for (int i = 1, left=centralIndex-1,right=centralIndex+1; i < values.length; i+=2,left--,right++) {
            dinDon[right]=values[i];
            if (values.length%2==0&&i==values.length-1){
                break;
            }
            dinDon[left]=values[i+1];
        }
        return dinDon; // Do your magic!
    }
}

