package org.example.java8features;

public class I {
    public static void main(String[] args) {
        @FunctionalInterface
        interface Runnable{
            void run();

            default void display(){
                System.out.println("display - Functional Interface");
            }
        }
        //1.traditional way
        class Worker implements Runnable{
            @Override
            public void run(){
                System.out.println("running - traditional way");
            }
        }
        Runnable worker = new Worker();
        worker.run();

        //2.Anonymous class
        Runnable anonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("running - anonymous way");
            }
        };
        anonymous.run();


    }
}
