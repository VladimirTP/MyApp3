package com.example.myapp3.lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Massenger {
    static Scanner in = new Scanner(System.in);
    static List<User> users = new ArrayList<>();

    public static void main(String[] args) {
        workWithUser();
    }

    public static int inputOption() {
        int index;
        while (true) {
            String option = in.nextLine();
            try {
                index = Integer.parseInt(option);
                if (index<1 || index >4) {
                    throw new Exception();
                } else break;
            } catch (NumberFormatException e) {
                System.out.println("Повторите ввод");
            } catch (Exception e) {
                System.out.println("Введите 1,2,3,4");
            }
        } return index;
    }

    public static void registerNewUser() {
        System.out.println("Введите имя нового пользователя:");
        String userName = in.nextLine();
        for (User user : users) {
            if (user.getName().equals(userName)) {
                System.out.println("Данный пользователь уже зарегистрирован");
                return;
            }
        }
        users.add(new User(userName));
        System.out.println("Пользователь зарегистрирован.");
    }

    public static void writeToRegisterUser () {
        System.out.println("Введите имя пользователя, которому хотите написать:");
        String userName = in.nextLine();
        boolean registeredUser = false;
        for (User user: users) {
            if (user.getName().equals(userName)) {
                registeredUser = true;
                System.out.println("Напишите сообщение: ");
                String message = in.nextLine();
                user.writeToUser(message);
                System.out.println("Ваше сообщение отправлено");
            }
        }
        if (!registeredUser) System.out.println("Пользователь незарегистрирован");
    }

    public static void readMessageFromUser () {
        System.out.println("Введите имя пользователя, чьи сообщения нужно прочитать:");
        String userName = in.nextLine();
        boolean registeredUser = false;
        for (User user: users) {
            if (user.getName().equals(userName)) {
                registeredUser = true;
                user.readMessage();
            }
        }
        if (!registeredUser) System.out.println("Пользователь незарегистрирован");
    }

    public static void workWithUser() {
        do {
            System.out.println("Выберете вариант: ");
            System.out.println("1 - Зарегистрировать нового пользователя");
            System.out.println("2 - Написать сообщение пользователю");
            System.out.println("3 - Прочитать сообщение пользователя");
            System.out.println("4 - Выйти из программы");
            int operation = inputOption();
            switch (operation) {
                case 1: {
                    registerNewUser();
                    break;
                }
                case 2: {
                    if (!users.isEmpty()) writeToRegisterUser();
                    else System.out.println("Зарегистрируйте нового пользователя");
                    break;
                }
                case 3: {
                    if (!users.isEmpty()) readMessageFromUser();
                    else System.out.println("Зарегистрируйте нового пользователя");
                    break;
                }
                case 4: return;
                default: workWithUser();
            }
        } while (true);
    }
}