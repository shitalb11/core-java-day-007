package org.example.java8featuresBySelf;


public class C_functionalInterface {

@FunctionalInterface
interface Square{
     int square(int x);
 }

    public static void main(String[] args) {
        Square s = x -> x*x;
        System.out.println(s.square(5));
    }
}
