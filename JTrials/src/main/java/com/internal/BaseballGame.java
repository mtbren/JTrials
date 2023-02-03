package com.internal;

import java.util.ArrayList;
import java.util.List;

public class BaseballGame {
    public static int calPoints(String[] ops) {
        List<Integer> scores = new ArrayList<>();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("C")){
                scores.remove(scores.size()-1);
            }else if (ops[i].equals("D")){
                scores.add(scores.get(scores.size()-1)*2);
            }else if (ops[i].equals("+")){
                scores.add(scores.get(scores.size()-1) +
                        scores.get(scores.size()-2));
            }else{
                scores.add(Integer.parseInt(ops[i]));
            }
        }
        int total=0;
        for (int i=0;i<scores.size(); i++) {
            total += scores.get(i);
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(calPoints(new String[]{"5","2","C","D","+"})); //30
        System.out.println(calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));//27
        System.out.println(calPoints(new String[]{"1"}));
    }
}
