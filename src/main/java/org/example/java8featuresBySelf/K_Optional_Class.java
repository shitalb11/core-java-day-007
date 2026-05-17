package org.example.java8featuresBySelf;

import java.sql.SQLOutput;
import java.util.Optional;

public class K_Optional_Class {
    public static void main(String[] args) {
        String name = null;

        Optional<String> obj = Optional.ofNullable(name);

        System.out.println(obj.orElse("Default Name"));
    }
}
