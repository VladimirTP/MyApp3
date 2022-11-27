package com.example.myapp3;

import java.util.Random;
import java.util.Scanner;

public class CallTest {
    public static void main(String[] args) {
        SimCard [] sim = new SimCard[getItFromRange(1,10)];
        for (int i = 0; i < sim.length; i++) {
            switch (getItFromRange(0,2)) {
                case 0: sim [i] = new MtsSimCard(getItFromRange(0,20), String.valueOf(getItFromRange(1000000,9999999)));
                    break;
                case 1: sim [i] = new A1SimCard(getItFromRange(0,20), String.valueOf(getItFromRange(1000000,9999999)));
                    break;
                case 2: sim [i] = new LifeSimCard(getItFromRange(0,20), String.valueOf(getItFromRange(1000000,9999999)));
                    break;
            }
            System.out.println(sim[i].getOperatorName() + " " + sim[i].getNumber() + " " + sim[i].getBalance());
        }

        Scanner scanner = new Scanner(System.in);
        Phone myPhone = new Phone(new SimCard(0,""));
        for (int i = 0; i < sim.length; i ++) {
            if (i%2==0) {
                myPhone.insertNewSim(sim[i]);
                System.out.println("Введите номер телефона, на который хотите позвонить с кодом оператора ");
                String putYourNumber = scanner.nextLine();
                myPhone.makeCall(putYourNumber);
                myPhone.printBalance();
            } else {
                myPhone.insertNewSim(sim[i]);
                System.out.println("Номер с которого вам звонят с кодом оператора ");
                String getYourNumber = scanner.nextLine();
                myPhone.receiveCall(getYourNumber);
                myPhone.printBalance();
            }
        }
    }
    static int getItFromRange (int min, int max) {
        Random random = new Random();
        return random.nextInt(max-min+1)+min;
    }
}
