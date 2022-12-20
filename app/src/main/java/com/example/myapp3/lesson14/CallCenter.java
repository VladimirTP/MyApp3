package com.example.myapp3.lesson14;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class CallCenter {
    public static void main(String[] args) {
        Random random = new Random();
        Queue<InputCall> inputCall = new LinkedList<>();
        String consultation = "Консультация";
        String order = "Заказ";

        for (int i = 0; i < 8; i++) {
            inputCall.offer(new InputCall(InputCall.getId(),InputCall.getCallPurpose()));
        }

        Runnable myRunnable = () ->  {
            while (inputCall.poll()!=null) {
                synchronized (inputCall) {
                    InputCall.setId(random.nextInt(1000));
                    InputCall.setCallPurpose(random.nextInt(2) == 0 ? consultation : order);
                    System.out.println("Звонок id = " + InputCall.getId() + ", Цель звонка: " +  InputCall.getCallPurpose());
                    System.out.println("Обработан работником: " + Thread.currentThread().getName());
                    try{
                        Thread.sleep(1000);
                    }
                    catch(InterruptedException e){
                        System.out.println("Thread has been interrupted");
                    }
                }
            }
        };
        Thread run1 = new Thread(myRunnable);
        run1.setName("Ivan");
        run1.start();
        Thread run2 = new Thread(myRunnable);
        run2.setName("Alena");
        run2.start();
        Thread run3 = new Thread(myRunnable);
        run3.setName("Dmitriy");
        run3.start();
    }
}
