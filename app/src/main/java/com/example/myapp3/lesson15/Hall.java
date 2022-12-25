package com.example.myapp3.lesson15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Hall {
    private int numberOfPerson;
    private int maxPeopleInBigElevator=10;
    private int maxPeopleInHighSpeedElevator=6;
    private int peopleInElevator;

    public void setNumberOfPerson(){
        while (true){
            Scanner in = new Scanner(System.in);
            System.out.println("Введите количество людей на площадке");
            try {
                int quantity = in.nextInt();
                this.numberOfPerson = quantity;
                if(quantity >0){
                    System.out.println("Количество людей на площадке: " + quantity);
                    break;
                } else if (quantity==0){
                    System.out.println("Людей на площадке нет, программа завершена ");
                    System.exit(0);
                }
            } catch (InputMismatchException e) {
                System.out.println("Повторите ввод");
            }
        }
    }

    public synchronized void getHighSpeedElevator() {
        if (numberOfPerson>=maxPeopleInHighSpeedElevator){
            peopleInElevator=maxPeopleInHighSpeedElevator;
        } else {
            peopleInElevator = numberOfPerson;
        }
        numberOfPerson = numberOfPerson-peopleInElevator;
        System.out.println("Скоростной лифт поднял " + peopleInElevator + " человек");
        System.out.println("Количество людей на площадке: " + numberOfPerson);
    }

    public synchronized void getBigElevator() {
        if (numberOfPerson>=maxPeopleInBigElevator){
            peopleInElevator=maxPeopleInBigElevator;
        } else {
            peopleInElevator = numberOfPerson;
        }
        numberOfPerson = numberOfPerson-peopleInElevator;
        System.out.println("Большой лифт поднял " + peopleInElevator + " человек");
        System.out.println("Количество людей на площадке: " + numberOfPerson);
    }

    public int getNumberOfPerson(){
        return numberOfPerson;
    }
}
