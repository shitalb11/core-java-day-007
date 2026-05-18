package org.example.java8featuresBySelf;

import java.util.function.Supplier;

public class N_Supplier_Interface {
    public static void main(String[] args) {

        Supplier<Double> s = () -> Math.random();

        System.out.println(s.get());
    }
}