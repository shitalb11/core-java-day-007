package org.example.java8features;

public class K {
    public static void main(String[] args) {
        interface NumberProcessor {
            int process(int number);
        }
        NumberProcessor square = (int number) -> {
            return number * number;
        };


    }
}
