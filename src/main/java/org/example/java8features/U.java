package org.example.java8features;

public class U {

            U(){}

            U(String str){
            System.out.println(str);
            }

            void m1(String str){
            System.out.println(str);
        }

    public static void main(String[] args) {
                interface A{
                    void m1(String str);
                }
                A a = str -> System.out.println(str);
                a.m1("g.m.");

                A ref = System.out::println;
                ref.m1("g.a.");

                A ref2 = U::new;
                ref2.m1("string using constructor reference");

                U u = new U();
                A ref3 = u::m1;
                ref3.m1("non static method reference");
    }
}