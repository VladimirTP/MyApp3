package com.example.myapp3.lesson13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class HomeWorkStream {
    private static final List <Integer> randomElements = new ArrayList<>();
    private static final int MIN_RANGE_NUMBER = 0;
    private static final int MAX_RANGE_NUMBER = 20;
    private static Consumer <Integer> printEvenInRange = number -> {
        if (number % 2 == 0 && number >= 7 && number <= 17) {
            System.out.println("Четные элементы в диапазоне от 7 до 17 :" + number);
        }
    };

    public static void main(String[] args) {
        filledList(enterQuantity());
        System.out.println ("Полученный список элементов: " + randomElements);
        List <Integer> filteredList = randomElements.stream()
                .distinct()
                .peek(printEvenInRange)
                .map(number -> number * 2)
                .filter(number -> number > 10)
                .collect(Collectors.toList());
        System.out.println("Элементы стрима после удвоения, которые > 10: " + filteredList);
        System.out.println("Количество элементов в стриме: " + filteredList.size());
        System.out.println("Среднее арифметическое всех чисел в стриме:  " + filteredList.stream().collect(Collectors.averagingInt(number -> number)));
    }

    public static int enterQuantity () {
        System.out.println("Введите количество элементов коллекции");
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                int quantity = in.nextInt();
                return quantity;
            } catch (InputMismatchException e) {
                System.out.println("Некорректный ввод. Введите число");
            }
        }
    }

    static int getItFromRange (int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }

    public static void filledList (int quantity) {
        for (int i = 0; i < quantity; i++) {
            randomElements.add(getItFromRange(MIN_RANGE_NUMBER, MAX_RANGE_NUMBER));
        }
    }
}
