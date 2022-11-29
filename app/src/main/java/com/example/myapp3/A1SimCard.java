package com.example.myapp3;

public final class A1SimCard extends SimCard{
    public A1SimCard (int balance, String number) {
        super(balance, "33"+number);
    }
    @Override
    public String getOperatorName (){
        return "A1";
    }
    @Override
    public void makeCall (String number){
        int payment;
        payment = (number.startsWith("33")) ? 1 : 3;
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
        if (number.startsWith("33")) {
            super.receiveCall(number);
        } else {
            payment = 1;
            setBalance(getBalance()-payment);
            super.receiveCall(number);
        }
    }
}
