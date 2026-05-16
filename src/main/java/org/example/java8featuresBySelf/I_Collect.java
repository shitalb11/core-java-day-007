package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class I_Collect {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("ram","sham","ravi","rishabh");

        List<String> result = names.stream()
                .filter(x->x.startsWith("r"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
