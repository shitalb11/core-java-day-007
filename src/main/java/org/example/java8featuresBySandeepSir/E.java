package org.example.java8featuresBySandeepSir;

public class E {
    public static void main(String[] args) {
        interface UserService{
            public static void count(){
                System.out.println("counting");
            }
        }
        //static method will be called using interface name
        UserService.count();
    }
}
