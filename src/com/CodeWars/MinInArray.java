package com.CodeWars;

import java.util.*;

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

    /**
     * Вернуть массив / список, где четные числа идут первыми, а затем нечетные
     * * Так, мужчины сильнее , чем мальчики , тогда даже цифры в порядке возрастания Хотя шансы в порядке убывания .
     * Размер массива / списка не менее * 4 ***.
     * * Числа массива / списка могут быть смесью позитивов и негативов .
     * * Не бойтесь , Гарантируется, что нулей не будет .! альт
     * * Может произойти повторение чисел в массиве / списке , поэтому (дублирование не учитывается при разделении) .
     */
    public static int[] menFromBoys(final int[] values) {
        // Your Code is Here .. Enjoy !! , Don't Forget To Vote :wink: :wink
       TreeSet<Integer> integers = new TreeSet<>();
       List<Integer> even = new ArrayList<Integer> ();
       List <Integer> notEven = new ArrayList<Integer>  ();
        for (int num:values){
            integers.add(Integer.valueOf(num));
        }
        for (Integer n:integers){
            if (n % 2 == 0) even.add(n);
            else notEven.add(n);
        }
        Collections.reverse(notEven);
        even.addAll(notEven);
        int [] res = new int[even.size()];
        for (int i = 0; i < res.length; i++) {
            res[i]=even.get(i);
        }
        return res;
    }
}

