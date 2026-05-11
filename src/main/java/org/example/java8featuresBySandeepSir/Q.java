package org.example.java8featuresBySandeepSir;

import java.util.function.Function;

public class Q {
    public static void main(String[] args) {
            Function<String, Integer> function = (String str) -> {
                return str.length();
            };
            System.out.println("String length is "+function.apply("Shital Bhosale"));
    }
}
