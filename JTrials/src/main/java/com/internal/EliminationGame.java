package com.internal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EliminationGame {
    public int lastRemaining(int n) {
        if (n == 1)
            return 1;
        List<Integer> list1 = IntStream.rangeClosed(1, n).mapToObj(i -> Integer.valueOf(i)).collect(Collectors.toList());
        List<Integer> list2 = new ArrayList<>();
        while (true) {
            for (int i = 1; i < list1.size(); i += 2) {
                list2.add(list1.get(i));
            }
            if (list2.size() == 1)
                return list2.get(0);
            list1.clear();

            for (int i = list2.size() % 2 == 0 ? 0 : 1; i < list2.size(); i += 2) {
                list1.add(list2.get(i));
            }
            if (list1.size() == 1)
                return list1.get(0);
            list2.clear();
        }
    }

    public static void main(String[] args) {
        //System.out.println(new EliminationGame().lastRemaining(9)); // 6
        System.out.println(new EliminationGame().lastRemaining(6)); // 6
    }
}
