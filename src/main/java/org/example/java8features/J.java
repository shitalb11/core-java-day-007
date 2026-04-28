package org.example.java8features;

public class J {
    public static void main(String[] args) {

        interface A{
            void m1();
        }
        A a = () -> System.out.println("m1");
        a.m1();

        interface B {
            void m2(int a);
        }
        B b = x -> System.out.println("m2" + x);
        b.m2(10);


    }
}
