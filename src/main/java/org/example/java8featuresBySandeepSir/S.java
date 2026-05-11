package org.example.java8featuresBySandeepSir;

import java.util.function.BiFunction;

public class S {
    public static void main(String[] args) {
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> s1.length() + s2.length();
        System.out.println(biFunction.apply("hi", "hello"));
    }
}
