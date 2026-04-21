package org.example.java8features;

public class F {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Runnable{
            void run();

            default void display(){
                System.out.println("display - Functional Interface");
            }
        }


    }
}
