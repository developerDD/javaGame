package com.ITVDN.Collections;

public class SimpleQueue<T> {
    private int capacity =10;
    private int front;
    private int rear;
    private int countElements;
    private Object[] arr;

    public SimpleQueue(){
        this.arr=  new Object[capacity];
        this.rear=-1;
        this.front=0;
        this.countElements=0;
    }
    public SimpleQueue(int sizeQueue){
        this.arr=  new Object[sizeQueue];
        this.rear=-1;
        this.front=0;
        this.countElements=0;
        this.capacity =sizeQueue;
    }

    public boolean offer(T element){
        if(rear==capacity-1){
            rear =-1;
        }
        if (element!=null&&countElements<capacity){
            arr[++rear]= element;
            countElements++;
            return true;
        }else {
            return false;
        }
    }

    public T poll(){
        if (countElements!=0){
            if (front==capacity){
                front=0;
            }
            countElements--;
            return (T) arr[front++];
        }
        return null;
    }

    public T peek(){
        if (countElements==0){
            return null;
        }else {
            return (T) arr[rear];
        }
    }

    public boolean isEmpty() {
        return (countElements==0);
    }
}

class MainQueue{
    public static void main(String[] args) {
        SimpleQueue<Integer> simpleQueue = new SimpleQueue<>(2);
        System.out.println(simpleQueue.offer(1));
        System.out.println(simpleQueue.offer(2));

        System.out.println(simpleQueue.poll());
        System.out.println(simpleQueue.offer(3));

        while (!simpleQueue.isEmpty()) {
            System.out.println(simpleQueue.poll());
        }
    }
}