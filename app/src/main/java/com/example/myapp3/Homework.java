package com.example.myapp3;

import java.util.Scanner;

public class Homework {
    public static void main (String [] args) {
        task1 ();
        task2 ();

    }

    static void task1 () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int a = in.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }

    static void task2 () {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите вещественное число a =");
        double a = in.nextDouble();
        System.out.println("Введите вещественное число b =");
        double b = in.nextDouble();
        System.out.println("Введите вещественное число c =");
        double c = in.nextDouble();

        a = (a < 0) ? -a : a;
        b = (b < 0) ? -b : b;
        c = (c < 0) ? -c : c;

        if (a < b && a < c) {
            System.out.println("Наименьшее число" + a);
        } else if (b < a && b < c) {
            System.out.println("Наименьшее число" + b);
        } else {
            System.out.println("Наименьшее число" + c);
        }


    }
}
