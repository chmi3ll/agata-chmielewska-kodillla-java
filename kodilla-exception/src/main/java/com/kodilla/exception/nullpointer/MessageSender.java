package com.kodilla.exception.nullpointer;

public class MessageSender {
    public void sendMessageTo(User user, String message) throws MessageNotSendExeption {
        if(user != null) {
            System.out.println("Sending message: " + message + " to: " + user.getName());
        }
        throw new MessageNotSendExeption("Object User was null");
    }
}
