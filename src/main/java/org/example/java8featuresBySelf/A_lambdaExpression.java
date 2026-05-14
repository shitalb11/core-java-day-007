package org.example.java8featuresBySelf;

public class A_lambdaExpression {

    interface Demo{
        void show();
    }

    public static void main(String[] args) {
        Demo d = () -> System.out.println("Hello JAVA 8");
        d.show();
    }

}
