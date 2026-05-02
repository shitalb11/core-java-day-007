package org.example.java8features;

public class N {
    public static void main(String[] args) {
        interface Predicate<X, Y> {
           boolean test(X x , Y y);
        }

        Predicate<String, String> stringStringPredicate = (s1 , s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(stringStringPredicate.test("abc" , "abc"));
        System.out.println(stringStringPredicate.test("zyx" , "abc"));
    }
}
