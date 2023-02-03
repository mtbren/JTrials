package com.internal;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (i % 10 == 0)
                continue;
            if (i < 10) {
                list.add(i);
            } else {
                StringBuffer strBuf = new StringBuffer(""+i);
                if (strBuf.toString().contains("0")) {
                    continue;
                }
                int count = strBuf.length();
                for (int j = 0; j < strBuf.length(); j++) {
                    if (i % Integer.parseInt(""+strBuf.charAt(j)) == 0) {
                        count--;
                    }
                }
                if (count == 0) {
                    list.add(i);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        //selfDividingNumbers(1, 22);
        selfDividingNumbers(47, 85);
    }
}
