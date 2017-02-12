package com.datadriver.test;

import java.io.PrintStream;

/**
 * Created by weiyong on 2017/2/9.
 */
class TestIdea {
    public static void main(String[] args){
        Ticket ticket1 = new Ticket();
        Thread thread1 = new Thread(ticket1);
        Thread thread2 = new Thread(ticket1);
        Thread thread3 = new Thread(ticket1);
        Thread thread4 = new Thread(ticket1);
        Thread thread5 = new Thread(ticket1);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
class Ticket extends Thread{
    private int totalTickets=30;
    public void run(){
        while(totalTickets>0) {
            synchronized (TestIdea.class) {
                if(totalTickets>0) {
                    System.out.println(this.currentThread().getName() + "...." + totalTickets--);
                }
            }
        }
    }
}
