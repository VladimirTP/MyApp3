package com.example.myapp3;

public class Phone {
    private SimCard sim;

    public Phone(SimCard sim) {
        this.sim = sim;
    }
    void insertNewSim(SimCard sim1) {
        sim = sim1;
        System.out.println("Замена симкарты. Номер: " + sim.getNumber() + ", Оператор: " + sim.getOperatorName() + ", Баланс: " + sim.getBalance());
    }
    public void makeCall (String number) {
        sim.makeCall(number);
    }
    public void receiveCall (String number) {
        sim.receiveCall(number);
    }
    public void printBalance () {
        System.out.println("Текущий баланс: " + sim.getBalance());
    }
}
