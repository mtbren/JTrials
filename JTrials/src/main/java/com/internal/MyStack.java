package com.internal;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyStack {

    Queue<Integer> q1;
    Queue<Integer> q2;
    public MyStack() {
        q1 = new ArrayDeque<Integer>();
        q2 = new ArrayDeque<Integer>();
    }

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        Integer lastElem = q1.remove();
        while(q1.peek()!=null){
            q2.add(lastElem);
            lastElem = q1.remove();
        }
        while(q2.peek()!=null){
            q1.add(q2.remove());
        }

        return lastElem;
    }

    public int top() {
        int topElem = 0 ;
        while(q1.peek()!=null){
            topElem = q1.remove();
            q2.add(topElem);
        }
        while(q2.peek()!=null){
            q1.add(q2.remove());
        }
        return topElem;
    }

    public boolean empty() {
        return q1.peek()==null;
    }
}
