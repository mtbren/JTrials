package com;

public class Base7 {
    public static String convertToBase7(int num) {
        StringBuffer strbuf = new StringBuffer();
        int origNum = num;
        num = Math.abs(num);
        int rem;
        while(true){
            rem = num%7;
            num = num/7;
            strbuf.append(rem);

            if(num==0)
                break;
        }
        if(origNum<0)
            strbuf.append("-");
        return strbuf.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(convertToBase7(100));
        System.out.println(convertToBase7(-7));
    }
}
