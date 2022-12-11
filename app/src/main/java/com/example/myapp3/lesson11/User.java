package com.example.myapp3.lesson11;

import java.util.LinkedList;
import java.util.Queue;

public class User {
    private String name;
    private Queue<String> messages = new LinkedList<>();

    public User (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Queue<String> getMessages() {
        return this.messages;
    }

    public void writeToUser (String message) {
        messages.add(message);
    }

    public void readMessage () {
        if (this.getMessages().isEmpty()) {
            System.out.println("Список сообщений пуст");
        } else {
            while (!this.getMessages().isEmpty()) {
                System.out.println("Полученные сообщения: " + messages.poll());
            }
        }
    }
}
