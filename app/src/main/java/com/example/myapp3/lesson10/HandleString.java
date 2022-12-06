package com.example.myapp3.lesson10;

public class HandleString {

    public static void digitBlock (String documentNumber) {
        System.out.println(documentNumber.substring(0, 4) + documentNumber.substring(8, 13));
    }
    public static void blockWithHiddenLetter (String documentNumber) {
        System.out.println(documentNumber.replaceAll("[A-z]", "*"));
    }
    public static void formatLetter(String documentNumber) {
        documentNumber=documentNumber.toUpperCase();
        StringBuilder documentLetter = new StringBuilder("Letters: ");
        documentLetter.append(documentNumber, 5, 8).append("/").append(documentNumber, 14, 17).append("/").append(documentNumber, 19, 22);
        documentLetter.deleteCharAt(documentLetter.length() - 2);
        System.out.println(documentLetter);
    }
    public static void checkSequence(String documentNumber) {
        if (documentNumber.toLowerCase().regionMatches(5, "abc", 0, 3) || documentNumber.toLowerCase().regionMatches(14, "abc", 0, 3)) {
            System.out.println("Последовательность содержит abc/ABC");
        } else {
            System.out.println("Последовательность не содержит abc/ABC");
        }
    }
    public static void checkEndSequence(String documentNumber) {
        if (documentNumber.endsWith("1a2b")) {
            System.out.println("номер заканчивается на 1a2b");
        } else {
            System.out.println("номер не заканчивается на 1a2b");
        }
    }
}
