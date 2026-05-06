package org.example.java8features;

public class P {
    public static void main(String[] args) {
     interface Predicate<X, Y>{
         boolean test(X x, Y y);
     }

     Predicate<String, String> stringPredicate = (s1, s2) -> s1.equalsIgnoreCase(s2);
        System.out.println(stringPredicate.test("abc","abc"));
        System.out.println(stringPredicate.test("zyx","abc"));
    }
}
