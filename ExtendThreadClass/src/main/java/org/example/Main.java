package org.example;
class A extends Thread{
    @Override
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("A");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
class B extends Thread{
    @Override
    public void run(){
        for (int i=0;i<20;i++){
            System.out.println("B");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        b.start();
    }
}