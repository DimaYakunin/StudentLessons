package Multithreading;

import YouTubeLessons.Exeption;

public class Multithreading {
    public static void main(String[] args) throws Exeption {
        new MyThread().start();
        new MyThread().start();
        new MyThread().start();
        new Thread(new MyRunnable());
        new Thread(new MyRunnable());
        new Thread(new MyRunnable());
    }
}

class MyThread extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name is: " + Thread.currentThread().getName() + " i = " + i);
        }
    }

}

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 400; i++) {
            System.out.println("Thread name is: " + Thread.currentThread().getName() + " i = " + i);
        }
    }
}

class Threading extends Thread{
    @Override
    public void run(){
        System.out.println("1234");
    }
}