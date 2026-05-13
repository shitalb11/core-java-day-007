package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;

public class E_streamFilter {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        nums.stream()
                .filter(x->x%2==0)
                .forEach(System.out::println);
    }
}
