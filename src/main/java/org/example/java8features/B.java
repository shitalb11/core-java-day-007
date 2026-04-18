package org.example.java8features;

public class B {
    public static void main(String[] args) {
        abstract class MessageService {
            public abstract void send(String message);
        }

        //subclass using anonymous way
        MessageService messageService = new MessageService() {
            @Override
            public void send(String message) {
                System.out.println("sending message using anonymous class: " + message);
            }
        };
        messageService.send("hello shital");
    }
}
