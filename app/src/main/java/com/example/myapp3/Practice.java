package com.example.myapp3;

public class Practice {
    public static void main(String[] args) {
        CreditCard myVisa1 = new CreditCard();
        myVisa1.accountNumber = 111111111;
        myVisa1.currentSum = 1000;
        myVisa1.sum();
        myVisa1.minus();
        myVisa1.balance();
        System.out.println("Баланс карты" + myVisa1.accountNumber + " Составляет: " + myVisa1.balance());

        CreditCard myVisa2 = new CreditCard();
        myVisa2.accountNumber = 222222222;
        myVisa2.currentSum = 1500;
        System.out.println("Карта " + myVisa2.accountNumber + " Баланс карты: " + myVisa2.currentSum);

        CreditCard myVisa3 = new CreditCard();
        myVisa3.accountNumber = 333333333;
        myVisa3.currentSum = 800;
        System.out.println("Карта " + myVisa3.accountNumber + " Баланс карты: " + myVisa3.currentSum);

        myVisa1.sum();
        System.out.println("Баланс карты" + myVisa1.accountNumber + " Составляет: " + myVisa1.balance());
        myVisa2.sum();
        System.out.println("Баланс карты" + myVisa2.accountNumber + " Составляет: " + myVisa2.balance());
        myVisa3.minus();
        System.out.println("Баланс карты" + myVisa3.accountNumber + " Составляет: " + myVisa3.balance());
    }
}
