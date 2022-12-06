package com.example.myapp3.lesson10;

import java.util.Scanner;

public class HomeWorkString {
    private static final String REGEX_DOCUMENT = "\\d{4}-[A-z]{3}-\\d{4}-[A-z]{3}-\\d[A-z]\\d[A-z]";

    public static void main(String[] args) {
        String documentNumber;
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите номер документа в формате xxxx-yyy-xxxx-yyy-xyxy,где x — это число, а y — это буква");
            documentNumber = in.nextLine();
            if (documentNumber.matches(REGEX_DOCUMENT)) {
                break;
            } else {
                System.out.println("Неверный формат, повторите ввод");
            }
        }
        HandleString.digitBlock(documentNumber);
        HandleString.blockWithHiddenLetter(documentNumber);
        HandleString.formatLetter(documentNumber);
        HandleString.checkSequence(documentNumber);
        HandleString.checkEndSequence(documentNumber);
    }
}
