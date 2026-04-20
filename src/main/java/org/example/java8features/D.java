package org.example.java8features;

public class D {
    public static void main(String[] args) {
        abstract class UserService{
            public abstract void sayHello();
        }
        class UserServiceImpl extends UserService{
            @Override
            public void sayHello(){
                System.out.println("hello world");
            }
        }
        UserService userService = new UserServiceImpl();
        userService.sayHello();

        UserService anonymousService =new UserService() {
            @Override
            public void sayHello() {
                System.out.println("hello Anonymous");
            }
        };
        anonymousService.sayHello();
    }
}
