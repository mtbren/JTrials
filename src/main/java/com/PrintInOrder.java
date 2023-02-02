package com;

public class PrintInOrder {
    public PrintInOrder() {
        super();
        Thread t1 = new Thread();
        Thread t2 = new Thread();

        Thread t3 = new Thread();
        try {
            this.first(t1);
            t1.join();
            this.second(t2);
            t2.join();
            this.third(t3);
            t3.join();
        }catch(InterruptedException ie){

        }

    }

    public void first(Runnable printFirst) throws InterruptedException {

        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
    }

    public void second(Runnable printSecond) throws InterruptedException {

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
    }

    public void third(Runnable printThird) throws InterruptedException {

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

    public static void main(String[] args) {
        PrintInOrder pio = new PrintInOrder();
    }
}
