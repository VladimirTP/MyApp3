package com.example.myapp3;

import java.util.Scanner;

public class CreditCard {
    int accountNumber;
    int currentSum;
    int credited;
    int withdrawal;

    public void sum () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму начисления на карту: " +accountNumber);
        credited = in.nextInt();
        System.out.println ("Карта: " + accountNumber + " Общая сумма при начислении :"+ (currentSum + credited));
    }
    public void minus () {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите сумму снятия с карты: " +accountNumber);
        withdrawal = in.nextInt();
        if (withdrawal<=currentSum) {
            System.out.println ("Карта: " + accountNumber + "Общая сумма после снятия: " + (credited+currentSum-withdrawal));
        } else {
            System.out.println ("На карте недостаточно средств");
        }
    }
    public int balance() {
        int rest;
        if (withdrawal<=currentSum) {
            rest = currentSum + credited - withdrawal;
        } else {
            rest = currentSum + credited;
        }
        return rest;
    }
}
