package com;

public class MyHashMap {
    int[] keyArr;

    public MyHashMap() {
        keyArr = new int[1000000];
        for(int i=0;i<keyArr.length;i++){
            keyArr[i]=-1;
        }
    }

    public void put(int key, int value) {
        keyArr[key] = value;
    }

    public int get(int key) {
        return keyArr[key];
    }

    public void remove(int key) {
        keyArr[key]=-1;
    }

    public static void main(String[] args) {
        MyHashMap mh = new MyHashMap();
        mh.put(1,1); mh.put(2,2);
        System.out.println(mh.get(1));  // 1
        System.out.println(mh.get(3));  //-1
        mh.put(2,1);
        System.out.println(mh.get(2));  // 1
        mh.remove(2);
        System.out.println(mh.get(2));  //-1


    }
}

