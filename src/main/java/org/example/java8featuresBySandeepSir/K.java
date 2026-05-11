package org.example.java8featuresBySandeepSir;

public class K {
    public static void main(String[] args) {
        interface NumberProcessor {
            int process(int number);
        }
        NumberProcessor square = (int number) -> {
            return number * number;
        };
        System.out.println("square is = "+ square.process(5));

        NumberProcessor cube = number -> number*number*number;
        System.out.println("cube is = " + cube.process(5));
    }
}
