package org.example.java8featuresBySandeepSir;

import java.util.function.Consumer;

public class R {
    public static void main(String[] args) {
        Consumer<String> consumer = str -> System.out.println("Entered string is " + str);
        consumer.accept("hello world");
    }
}
