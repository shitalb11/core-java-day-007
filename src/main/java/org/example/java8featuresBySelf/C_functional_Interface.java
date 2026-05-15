package org.example.java8featuresBySelf;


public class C_functional_Interface {

@FunctionalInterface
interface Square{
     int square(int x);
 }

    public static void main(String[] args) {
        Square s = x -> x*x;
        System.out.println(s.square(5));
    }
}
