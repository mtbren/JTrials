package com;

import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQ = new PriorityQueue<>(5);
        pQ.add(6);pQ.add(7);pQ.add(8);pQ.add(9);pQ.add(10);pQ.add(11);
        //pQ.add(4);
        System.out.println(pQ.peek());
    }
}
