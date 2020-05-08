package com.ITVDN.Collections;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

public class SimpleEnumMap {
    public static void main(String[] args) {
        Map<Cars,String> EnumCarsStringMap = new EnumMap<Cars, String>(Cars.class);
        EnumCarsStringMap.put(Cars.AUDI,"Dima");
        EnumCarsStringMap.put(Cars.BMW,"Lena");
        EnumCarsStringMap.put(Cars.VOLVO,"Sasha");

        Set set = EnumCarsStringMap.entrySet();

        for (Object o : set) {
            Map.Entry  m = (Map.Entry) o;
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}

enum Cars{
    AUDI,BMW,VOLVO
}