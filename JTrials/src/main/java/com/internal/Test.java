package com.internal;

import java.util.*;

public class Test {

    public static void main(String[] args){
        /*LinkedList<Integer> list = new LinkedList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);list.add(6);
        list.remove();
        list.remove(2);
        list.removeLast();
        System.out.println(list);*/

        Stack<Integer> mystack = new Stack<>();
        mystack.push(11);mystack.push(12);mystack.push(13);mystack.push(14);mystack.push(15);
        System.out.println(mystack);
        mystack.pop();
        System.out.println(mystack.peek());
        System.out.println(mystack);

        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(1); myQueue.add(2); myQueue.add(3);myQueue.add(4); myQueue.add(5); myQueue.add(6);
        System.out.println(myQueue);
        myQueue.remove();
        System.out.println(myQueue.peek());
        System.out.println(myQueue);


        List<Integer> myQueue1 = new LinkedList<>();
        myQueue1.add(1); myQueue1.add(2); myQueue1.add(3);myQueue1.add(4); myQueue1.add(5); myQueue1.add(6);
        System.out.println(myQueue1);
        myQueue1.remove(3);
        myQueue1.add(7);
        System.out.println(myQueue1);


    }
}

