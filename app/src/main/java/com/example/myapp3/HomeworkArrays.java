package com.example.myapp3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeworkArrays {
    public static void main(String[] args) {
        taskArray2();
    }

    public static void taskArray2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива от 5 до 10: ");
        int num = scanner.nextInt();
        while (num <= 5 || num > 10) {
            System.out.println("Введите число в указанном диапазоне");
            num = scanner.nextInt();
        }

        int[] random = new int[num];
        int evenNums = 0;
        for (int i = 0; i < random.length; i++) {
            random[i] = (int) (Math.random() * num);
            if (random[i] % 2 == 0) {
                evenNums++;
            }
        }
        System.out.println(Arrays.toString(random));

        int[] even = new int[evenNums];
        int index = 0;
        for (int i = 0; i < num; i++) {
            if (random[i] % 2 == 0) {
                even[index] = random[i];
                index++;
            }
        }
        System.out.println("Массив четных чисел: " + Arrays.toString(even));
    }
}

