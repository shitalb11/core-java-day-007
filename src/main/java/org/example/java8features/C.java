package org.example.java8features;

public class C {
    public static void main(String[] args) {
        class A{}
        class B extends A{}
        A a=new B();
        A a2=new A(){};

        interface MessageService{
            public abstract void send(String message);
        }
        class WhatsApp implements MessageService{
            public void send(String message){
                System.out.println(message);
            }
        }
        MessageService whatsAppService= new WhatsApp();

        MessageService messageService=new MessageService() {
            @Override
            public void send(String message) {
                System.out.println("sending message using anonymous class " + message);
            }
            void m1(){
            }
        };
        messageService.send("hello shital");
    }
}
