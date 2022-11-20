package com.example.myapp3;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArrays {
    public static void main(String[] args) {
        taskMulti1();
        taskMulti2();
    }
    public static void taskMulti1() {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность 1-го массива, число >=0: ");
        int first = in.nextInt();
        System.out.println("Введите размерность 2-го массива, число >=0: ");
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
    public static void taskMulti2 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размерность 1-го массива: ");
        int first = in.nextInt();
        System.out.println("Введите размерность 2-го массива: ");
        int second = in.nextInt();
        System.out.println("Введите размерность 3-го массива: ");
        int third = in.nextInt();
        int [][][] arrays = new int[first][second][third];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                for (int k = 0; k < arrays[i][j].length; k++) {
                    arrays[i][j][k] = (int) ((Math.random()*10)+1);
                }
            }
        }
        System.out.println(Arrays.deepToString(arrays));
        String [][][] strings = new String [first][second][third];
        String textNumber = null;
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                for (int k = 0; k < arrays[i][j].length; k++) {
                    int number = arrays[i][j][k];
                    switch (number) {
                        case 1: {textNumber = "one";break;}
                        case 2: {textNumber = "two";break;}
                        case 3: {textNumber = "three";break;}
                        case 4: {textNumber = "four";break;}
                        case 5: {textNumber = "five";break;}
                        case 6: {textNumber = "six";break;}
                        case 7: {textNumber = "seven";break;}
                        case 8: {textNumber = "eight";break;}
                        case 9: {textNumber = "nine";break;}
                        case 10: {textNumber = "ten";break;}
                    }
                    strings[i][j][k] = textNumber;
                }
            }
        }
        System.out.println(Arrays.deepToString(strings));
    }
}
