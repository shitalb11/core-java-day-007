package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;

public class H_Stream_distinct {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,2,3,3,4,5);

        nums.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
