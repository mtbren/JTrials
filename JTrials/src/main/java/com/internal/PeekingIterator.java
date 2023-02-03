package com.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class PeekingIterator implements Iterator<Integer> {
    private static List<Integer> innerList = new ArrayList<Integer>();
    private static int ptr;
    public PeekingIterator(Iterator<Integer> iterator) {
        // initialize any member here.
        while(iterator.hasNext()){
            innerList.add(iterator.next());
        }
        ptr = 0;
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
        return innerList.get(ptr);
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        return innerList.get(ptr++);
    }

    @Override
    public boolean hasNext() {
        return ptr < innerList.size();
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList();
        arr.add(1);arr.add(2);arr.add(3);arr.add(4);
        PeekingIterator peekI = new PeekingIterator(arr.iterator());
        System.out.println(peekI.hasNext());
        System.out.println(peekI.peek());
        System.out.println(peekI.peek());
        System.out.println(peekI.next());
        System.out.println(peekI.next());
        System.out.println(peekI.peek());
        System.out.println(peekI.peek());
        System.out.println(peekI.next());
        System.out.println(peekI.hasNext());
        System.out.println(peekI.peek());
        System.out.println(peekI.hasNext());
        System.out.println(peekI.next());
        System.out.println(peekI.hasNext());
    }


}
