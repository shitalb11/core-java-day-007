package org.example.java8featuresBySandeepSir;

public class M {
    public static void main(String[] args) {

        interface Predicate<X> {
            boolean test(X input);
        }
        Predicate<Integer> isEven = (Integer input) -> input % 2 == 0;
        System.out.println("is Even test : " + isEven.test(10));

        Predicate<String> startWithA = (String str) -> str.startsWith("A");
        System.out.println(startWithA.test("Abc"));
        System.out.println(startWithA.test("xyz"));
    }
}