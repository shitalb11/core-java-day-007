package org.example.java8featuresBySelf;

interface Demo{
    void show();
}

public class A_Lambda_Expression {
    public static void main(String[] args) {
        Demo d = () -> System.out.println("Hello JAVA 8");
        d.show();
    }
}
