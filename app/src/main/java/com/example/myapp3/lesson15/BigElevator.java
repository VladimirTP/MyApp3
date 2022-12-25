package com.example.myapp3.lesson15;

public class BigElevator implements Runnable {
    Hall hall;
    BigElevator (Hall hall) {
        this.hall = hall;
    }
    @Override
    public void run() {
        while (hall.getNumberOfPerson()>0) {
            hall.getBigElevator();
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
