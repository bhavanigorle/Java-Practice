package org.example.Java_Backend.Java8;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("In other thread");
    }
}
