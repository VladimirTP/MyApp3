package com.example.myapp3.lesson9;

import java.util.Scanner;

public class HomeWorkException {
    static final String REQUIREMENT = "[A-Za-z\\d_]{1,20}";

    public static void main(String[] args) {
        inputChecking();
    }

    public static void inputChecking () {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите Ваш login ");
            String login = in.nextLine();
            System.out.println("Введите Ваш password ");
            String password = in.nextLine();
            System.out.println("Подтвердите password ");
            String confirmPassword = in.nextLine();
            try {
                if (errorException(login, password, confirmPassword)) {
                    System.out.println("Данные введены верно");
                } break;
            } catch (WrongPasswordException | WrongLoginException e) {
                System.err.println("Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20 символов");
                System.err.println("Повторите ввод данных");
            }
        }
    }

    public static boolean errorException (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(REQUIREMENT)) {
            throw new WrongLoginException("Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20 символов");
        }
        else if (!password.matches(REQUIREMENT) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
        return true;
    }
}
