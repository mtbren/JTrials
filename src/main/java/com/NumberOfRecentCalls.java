package com;

import java.util.ArrayList;
import java.util.List;

public class NumberOfRecentCalls {
    private List<Integer> callsList ;
    private int lPtr;
    public NumberOfRecentCalls() {
        this.callsList = new ArrayList<Integer>();
        lPtr = 0;
    }

    public int ping(int t) {

        this.callsList.add(t);
        for(;this.callsList.get(lPtr)+3000<t;lPtr++){

        }
        return this.callsList.size()-lPtr;
    }

    public static void main(String[] args) {
        NumberOfRecentCalls norc = new NumberOfRecentCalls();
        System.out.println(norc.ping(1));
        System.out.println(norc.ping(100));
        System.out.println(norc.ping(3001));
        System.out.println(norc.ping(3002));
        System.out.println(norc.ping(3003));
        System.out.println(norc.ping(3004));
        System.out.println(norc.ping(3005));
        System.out.println(norc.ping(7000));

        norc = new NumberOfRecentCalls();
        System.out.println(norc.ping(7000));
    }
}
