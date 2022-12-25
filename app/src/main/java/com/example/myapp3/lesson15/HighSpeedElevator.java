package com.example.myapp3.lesson15;

public class HighSpeedElevator implements Runnable {
    Hall hall;
    HighSpeedElevator (Hall hall) {
        this.hall = hall;
    }
    @Override
    public void run() {
        while (hall.getNumberOfPerson()>0) {
            hall.getHighSpeedElevator();
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
