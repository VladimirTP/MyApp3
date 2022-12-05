package com.example.myapp3.lesson9;

import java.util.Scanner;

public class HomeWorkException {
    static final String INPUT_REQUIREMENT = "[A-Za-z\\d_]{1,20}";

    public static void main(String[] args) {
        registration();
    }

    public static void registration () {
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите Ваш login ");
            String login = in.nextLine();
            System.out.println("Введите Ваш password ");
            String password = in.nextLine();
            System.out.println("Подтвердите password ");
            String confirmPassword = in.nextLine();
            try {
                if (checkData(login, password, confirmPassword)) {
                    System.out.println("Данные введены верно");
                } break;
            } catch (WrongLoginException e) {
                System.err.println(e.getMessage());
            } catch (WrongPasswordException c) {
                System.err.println(c.getMessage());
            }
            System.err.println("Повторите ввод данных");
        }
    }

    public static boolean checkData (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (!login.matches(INPUT_REQUIREMENT)) {
            throw new WrongLoginException("Login должен содержать только латинские буквы, цифры и знак подчеркивания. Длина login должна быть меньше 20 символов");
        }
        else if (!password.matches(INPUT_REQUIREMENT) || !password.equals(confirmPassword)) {
            throw new WrongPasswordException("Password должен содержать только латинские буквы, цифры и знак подчеркивания. Длина password должна быть меньше 20 символов");
        }
        return true;
    }
}
