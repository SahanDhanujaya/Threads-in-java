package org.example;

class Calculation{
    int num;
    public synchronized void increment(){
        num++;
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Calculation calculation = new Calculation();
        Thread thread = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                calculation.increment();
            }
        });

        Thread thread1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                calculation.increment();
            }
        });
        thread.start();
        thread1.start();
        thread.join();
        thread1.join();
        System.out.println("Value: "+calculation.num);

    }
}