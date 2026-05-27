package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;

public class S_Find_Maximum_Number {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,30,40,50,60);

        int max=nums.stream()
                .max(Integer::compare)
                .get();

        System.out.println(max);
    }
}
