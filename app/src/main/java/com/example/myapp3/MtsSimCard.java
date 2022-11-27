package com.example.myapp3;

public final class MtsSimCard extends SimCard {
    public MtsSimCard (int balance, String number) {
        super(balance, "29"+number);
    }
    @Override
    public String getOperatorName (){
        return "MTS";
    }
    @Override
    public void makeCall (String number){
        int payment;
        payment = (number.startsWith("29")) ? 1 : 3;
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
        if (number.startsWith("29")) {
            super.receiveCall(number);
        } else {
            payment = 1;
            setBalance(getBalance()-payment);
            super.receiveCall(number);
        }
    }
}
