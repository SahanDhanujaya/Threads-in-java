package org.example;

public class Main {
    public static void main(String[] args) {
        new Thread(()->{for (int i = 0; i < 20; i++) {
            System.out.println("A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 20; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

    }
}