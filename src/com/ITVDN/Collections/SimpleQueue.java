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
        if (countElements<capacity&&element!=null){
            arr[++rear]= element;
            countElements++;
            return true;
        }else {
            return false;
        }
    }

    public T poll(){
        if (countElements!=0&&front<capacity){
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
        SimpleQueue<Integer> simpleQueue = new SimpleQueue<>(4);
        System.out.println(simpleQueue.offer(1));
        System.out.println(simpleQueue.offer(2));
        System.out.println(simpleQueue.offer(3));
        System.out.println(simpleQueue.offer(4));
        simpleQueue.poll();
        simpleQueue.poll();
        while (!simpleQueue.isEmpty()) {
            System.out.println(simpleQueue.poll());
        }
    }
}