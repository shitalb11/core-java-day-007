package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;

public class J_Method_Reference {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("A","B","C");
        names.forEach(System.out::println);
    }
}
