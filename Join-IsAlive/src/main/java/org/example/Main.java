package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(()->{for (int i = 0; i < 20; i++) {
            System.out.println("A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 30; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        System.out.println(t1.isAlive());
        t2.start();
        t1.join();
        System.out.println(t1.isAlive());
        t2.join();

    }
}