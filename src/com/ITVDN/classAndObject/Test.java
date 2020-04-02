package com.ITVDN.classAndObject;

class A{
        public int i = 5;
        public A(){

        }


}

public class Test extends A {
        public int is =10;
        private Test() {

        }

        public static strictfp void main (String [] args) {
              A y =  new Test();
                System.out.println(y);
        }
}
