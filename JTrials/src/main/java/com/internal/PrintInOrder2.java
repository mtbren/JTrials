package com.internal;

public class PrintInOrder2 {
    public PrintInOrder2() {

    }

    public static void main(String[] args) {
        PrintInOrder2 pio = new PrintInOrder2();
        Thread a = new Thread();
        Thread b = new Thread();
        Thread c = new Thread();
        

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
}
