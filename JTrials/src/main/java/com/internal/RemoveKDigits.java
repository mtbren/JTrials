package com.internal;

public class RemoveKDigits {
    public static String removeKDigits(String num, int k) {
        String origNum = num;
        if(k >= num.length())
            return "0";
        for(int i=0;i<k;i++){
            num = removeDigit(num);
        }
        return num;
    }
    private static String removeDigit(String num){
        if(num.length()<2)
            return "0";
        String strBldr = null;
        boolean removed = false;
        for(int i=0;i<num.length()-1;i++){
            if(num.charAt(i)>num.charAt(i+1)) {
                strBldr = num.substring(0, i) + num.substring(i + 1, num.length());
                removed = true;
                break;
            }
        }
        if(!removed) {
            if(num.charAt(0)>num.charAt(num.length()-1))
                strBldr = num.substring(1, num.length());
            else
                strBldr = num.substring(0, num.length()-1);
        }
        while(strBldr.startsWith("0") && strBldr.length()>1)
            strBldr = strBldr.substring(1);
        return strBldr;
    }

    public static void main(String[] args) {
        System.out.println(removeKDigits("1432219",3)); //1219
        System.out.println(removeKDigits("11432561",3)); //11251
        System.out.println(removeKDigits("1",3)); //0
        System.out.println(removeKDigits("333",3)); //0
        System.out.println(removeKDigits("3334",3)); //3
        System.out.println(removeKDigits("3335453",3)); //3333
        System.out.println(removeKDigits("10200",1)); //200
    }
}
