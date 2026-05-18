package org.example.java8featuresBySelf;

import java.util.function.Consumer;

public class M_Consumer_interface {
    public static void main(String[] args) {
        Consumer<String> c=x-> System.out.println(x);
        c.accept("Java 8");
    }
}
