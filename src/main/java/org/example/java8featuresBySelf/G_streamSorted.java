package org.example.java8featuresBySelf;

import java.util.Arrays;
import java.util.List;

public class G_streamSorted {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(2,7,9,4,6,1,0,5);
        
            nums.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
