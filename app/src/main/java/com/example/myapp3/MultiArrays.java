package com.example.myapp3;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        taskMulti1();
    }
    public static void taskMulti1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность 1-го массива: ");
        int first = in.nextInt();
        System.out.println("Введите размерность 2-го массива: ");
        int second = in.nextInt();
        int[][] overall = new int[first][second];
        int index = 0;
        int [] array = new int[first*second];
        for (int i = 0; i < overall.length; i++) {
            for (int j = 0; j < overall[i].length; j++) {
                overall[i][j] = (int) (Math.random() * 10);
                array[index++] = overall[i][j];
            }
        }
        System.out.println(Arrays.deepToString(overall));
        System.out.println(Arrays.toString(array));
    }
}
