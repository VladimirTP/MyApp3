package com.example.myapp3;

import java.util.Arrays;

public class HomeworkArrays {
    public static void main(String[] args) {
        taskArray1();
    }

    public static void taskArray1() {
        String [] names = {"Alex", "Egor", "Maksim", "Ilya"};
        Arrays.sort (names);
        System.out.println(Arrays.toString(names));
    }
}
