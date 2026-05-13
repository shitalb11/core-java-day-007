package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;

public class D_forEach {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram", "sham", "sita");
        names.forEach(name-> System.out.println(name));
    }
}
