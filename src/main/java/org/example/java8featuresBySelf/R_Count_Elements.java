package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;

public class R_Count_Elements {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram", "Ravi", "Sham", "Rohan");

        long count = names.stream()
                .filter(x -> x.startsWith("R"))
                .count();

        System.out.println(count);
    }
}
