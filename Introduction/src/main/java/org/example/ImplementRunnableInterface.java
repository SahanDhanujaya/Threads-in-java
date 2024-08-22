package org.example;

class MyNewThread implements Runnable{
    @Override
    public void run() {
        System.out.println("My thread is running");
    }
}
public class ImplementRunnableInterface {
    public static void main(String[] args) {
        MyNewThread myNewThread = new MyNewThread();
        Thread thread = new Thread(myNewThread);
        thread.start();
    }
}
