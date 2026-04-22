package org.example.java8features;

public class F {
    public static void main(String[] args) {

        interface UserService{
            void login();

            default void logout(){
                System.out.println("You are logged out. default implementation for all subclass");
            }
        }

        class Authentication implements UserService{
            public void login(){
                System.out.println("Login using username password");
            }
        }

        class OtpService implements UserService {
            public void login() {
                System.out.println("Login using otp");
            }
        }

        class TokenService implements UserService {
            public void login() {
                System.out.println("Login using token");
            }
            @Override
            public void logout(){
                System.out.println("Logout using token");
            }
        }

        UserService authentication = new Authentication();
        UserService otpService = new OtpService();
        UserService tokenService = new TokenService();

    }
}
