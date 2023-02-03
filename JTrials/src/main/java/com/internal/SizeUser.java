package com.internal;

/**
 * Created by Amit on 3/20/2018.
 */
public class SizeUser {
    public static void main(String[] args) {
        Size s = Size.SMALL;
        System.out.println(s.toString());
        System.out.println(s.getAbbreviation());
        for( Size t : Size.values()){
            System.out.println(t);
        }
    }
}
