package com.internal;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private List<Integer> hashList;
    public MyHashSet() {
        hashList = new ArrayList<Integer>();
    }

    public void add(int key) {
        if(hashList.contains(key))
            return;
        else
            hashList.add(key);
    }

    public void remove(int key) {
        hashList.remove((Integer)key);
    }

    public boolean contains(int key) {
        return hashList.contains(key);
    }

    public static void main(String[] args) {
        MyHashSet myh = new MyHashSet();
        myh.add(1);
        myh.add(2);
        System.out.println(myh.contains(1));//true
        System.out.println(myh.contains(3));//false
        myh.add(2);
        System.out.println(myh.contains(2));//true
        myh.remove(2);
        System.out.println(myh.contains(2));//false
    }
}
