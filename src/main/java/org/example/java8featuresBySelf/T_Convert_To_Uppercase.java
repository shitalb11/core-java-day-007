package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;

public class T_Convert_To_Uppercase {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("ram", "sham", "sita");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
