package org.example.java8features;

public class G {
    public static void main(String[] args) {
        interface Interface1{
            void method1();
            default void display(){
                System.out.println("Interface1.display");
            }
        }

        interface Interface2{
            void method2();
            default void display(){
                System.out.println("Interface2.display");
            }
        }

        class A implements Interface1, Interface2{

            @Override
            public void method1(){
                System.out.println("Method 1 overridden in A");
            }


        }


    }
}
