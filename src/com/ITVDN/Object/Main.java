package com.ITVDN.Object;

public class Main {
    public static void main(String[] args) {
        Device d1 = new Device("Sumsung","AD123",2033.3f);
        Device d2 = new Device("Sumsung","AD123",2033.3f);
        Device d3 = new Device("Sumsung","AD123",2033.3f);
        Device d4 = new Device("Sumsung","AD123DF",2033.3f);
        System.out.println(d1.hashCode()+" "+d2.hashCode()+" "+d3.hashCode()+" "+d4.hashCode());

        System.out.println(d1.equals(d1)+" "+d1.equals(d2)+" "+d2.equals(d3)+" "+d1.equals(d3)+" "+d1.equals(d4));
        System.out.println(d1);
        Monitor m1 = new Monitor("Orion","lsdls293",100.3f,1200,1200);
        Monitor m2 = new Monitor("Orion","lsdls293",100.3f,1200,1200);
        Monitor m3 = new Monitor("Orion","lsdls293",100.3f,1200,1200);
        Monitor m4 = new Monitor("Orion","lsdls233",100.3f,1200,1200);
        System.out.println(m1.hashCode()+" "+m2.hashCode()+" "+m3.hashCode()+" "+m4.hashCode());

        System.out.println(m1.equals(m1)+" "+m1.equals(m2)+" "+m2.equals(m3)+" "+m1.equals(m3)+" "+m1.equals(m4));
        System.out.println(m1);
    }
}
