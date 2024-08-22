package org.example;

class MyFirstThread extends Thread{
    @Override
    public void run() {
        System.out.println("My Thread is running");
    }
}
public class ExtendThreadClass {
    public static void main(String[] args) {
        MyFirstThread myFirstThread = new MyFirstThread();
        myFirstThread.start();
    }
}