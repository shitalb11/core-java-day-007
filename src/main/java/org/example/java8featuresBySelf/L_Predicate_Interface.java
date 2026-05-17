package org.example.java8featuresBySelf;

import java.util.function.Predicate;

public class L_Predicate_Interface {
    public static void main(String[] args) {
        Predicate<Integer> p = x ->x%2==0;
        System.out.println(p.test(11));
        System.out.println(p.test(10));
    }
}
