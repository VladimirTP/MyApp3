package com.example.myapp3.lesson15;

public class ElevatorOperation {
    public static void main(String[] args) {
        Hall hall = new Hall();
        BigElevator bigElevator = new BigElevator(hall);
        HighSpeedElevator highSpeedElevator = new HighSpeedElevator(hall);

        hall.setNumberOfPerson();
        new Thread(bigElevator).start();
        new Thread(highSpeedElevator).start();
    }
}
