package org.example.java8features;

public class O {
    public static void main(String[] args) {
        interface Predicate<X> {
            boolean test(X input);
        }

        Predicate<Integer> isEven = (Integer input) -> input % 2 == 0;
        System.out.println("is even test : " + isEven.test(10));



    }
}
