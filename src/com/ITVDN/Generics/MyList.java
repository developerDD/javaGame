package com.ITVDN.Generics;

public class MyList<T> {
    private int size;
    private static int capacity =16;
    private Object[] array;

    public MyList() {
        array=  new Object[capacity];
    }

    public void add(T o){
        if (size== capacity){
            capacity= size+(size/2);
            Object[] newArray = new Object[capacity];
            System.arraycopy(array,0,newArray,0,size);
           array=newArray;
        }
        array[size]=o;
        size++;
    }

    public T get(int index){
        if (index<=size){
            return (T) array[index];
        }
        System.out.println("index to much");
        return null;
    }

    public int getSize(){
        return size;
    }

    public static int getCapacity(){
        return capacity;
    }

    public void show(){
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i<size-1){
                System.out.print(array[i]+", ");
            }else {
                System.out.print(array[i]+"]");
            }
        }
    }
}
