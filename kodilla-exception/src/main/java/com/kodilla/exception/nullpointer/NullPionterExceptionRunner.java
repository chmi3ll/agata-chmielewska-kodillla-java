package com.kodilla.exception.nullpointer;

class NullPointerExceptionRunner {
    public static void main(String[] args) {
        User user = null;

        MessageSender messageSender = new MessageSender();

        try{
            messageSender.sendMessageTo(user, "Hello");
        } catch (MessageNotSendExeption e){
            System.out.println("Message not send,"+"but my program is still running very well");
        }
        System.out.println("processing other logic");

    }
}