package com.ITVDN.classAndObject;

class A{
        private int i = 5;
        public A(){
                System.out.println(getI());
        }

        public int getI() {
                return i;
        }

}

public class Test extends A {
        private static int i =10;
        private Test() {
                System.out.println(super.getI());
        }
        public int getI() {
                return i;
        }

        public static strictfp void main (String [] args) {
                new Test();
        }
}
