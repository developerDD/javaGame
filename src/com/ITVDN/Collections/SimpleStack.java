package com.ITVDN.Collections;

public class SimpleStack<T>{
    private int capacity = 10;
    private int top;
    private int flagInsert;
    private int countElement;
    Object[] stack;
    SimpleStack(){
        stack=new Object[capacity];
        top=-1;
        countElement=0;
        flagInsert=0;
    }
    SimpleStack(int size){
        stack=new Object[size];
        top=-1;
        countElement=0;
        flagInsert=0;
    }

    public boolean push(T element){
        if (countElement!=capacity){
            countElement++;
            stack[flagInsert++]=element;
            top++;
            return true;
        }else {
            return false;
        }
    }

    public T pop(){
        if (isEmpty()){
            return null;
        }else {
            countElement--;
            flagInsert--;
            return (T) stack[top--];
        }
    }

    public T peek(){
        if (isEmpty()){
            return null;
        }else {
            return (T)stack[top];
        }
    }

    public boolean isEmpty(){
        return (countElement==0);
    }
}
class MainStack{
    public static void main(String[] args) {
        SimpleStack <Integer> stack = new SimpleStack<>();
        stack.push(1);
        stack.push(10);
        stack.push(11);
        System.out.println(stack.isEmpty());
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        stack.push(11);
        stack.push(12);
        System.out.println(stack.peek());
        System.out.println(stack.pop());

    }
}
