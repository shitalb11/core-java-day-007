package org.example.java8featuresBySelf;

import java.util.function.Function;

public class O_Function_Interface {
    public static void main(String[] args) {
        Function<Integer, Integer> f=x->x*x*x;

        System.out.println(f.apply(3));
    }
}
