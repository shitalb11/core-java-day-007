package org.example.java8featuresBySelf;

public class B_Lambda_with_Parameters {

    interface Add {
        int addition(int a, int b);
    }

    public static void main(String[] args) {
        Add a = (x, y) -> x+y;
        System.out.println(a.addition(10, 20));
    }
}