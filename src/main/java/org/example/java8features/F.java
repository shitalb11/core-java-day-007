package org.example.java8features;

public class F {
    public static void main(String[] args) {

        interface UserService{
            void login();

            default void logout(){
                System.out.println("You are logged out. default implementation for all subclass");
            }
        }

    }
}
