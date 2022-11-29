package com.example.myapp3;

public final class LifeSimCard extends SimCard{
    public LifeSimCard (int balance, String number) {
        super(balance, "44"+number);
    }
    @Override
    public String getOperatorName (){
        return "Life";
    }
    @Override
    public void makeCall (String number){
        int payment;
        payment = (number.startsWith("44")) ? 1 : 3;
        if (getBalance() < payment) {
            System.out.println("Звонок запрещен.");
        } else {
            System.out.println("Звоню на номер " + number);
            setBalance(getBalance()-payment);
        }
    }
    @Override
    public void receiveCall (String number){
        int payment;
        if (number.startsWith("44")) {
            super.receiveCall(number);
        } else {
            payment = 1;
            setBalance(getBalance()-payment);
            super.receiveCall(number);
        }
    }
}
