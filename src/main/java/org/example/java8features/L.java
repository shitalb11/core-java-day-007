package org.example.java8features;

public class L {
    public static void main(String[] args) {
        interface Predicate{
            boolean test(int input);
        }
        Predicate isEven = input -> input % 2 == 0;
        System.out.println("is even test : " + isEven.test(10));
        System.out.println("is even test : " + isEven.test(11));
    }
}