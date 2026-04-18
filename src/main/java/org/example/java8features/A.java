package org.example.java8features;

public class A {
    public static void main(String[] args) {
        abstract class MessageService{
            public abstract void send(String message);
        }

        class WhatsApp extends MessageService{
            public void send(String message) {
                System.out.println("sending message using wp: "+ message);
            }
        }
        MessageService service = new WhatsApp();
        service.send("Good Morning");
    }
}
