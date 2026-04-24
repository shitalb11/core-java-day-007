package org.example.java8features;

public class G {
    public static void main(String[] args) {
        interface Interface1{
            void method1();

            default void display(){
                System.out.println("Interface1.display");
            }
        }

    }
}
