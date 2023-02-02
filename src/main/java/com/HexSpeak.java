package com;

public class HexSpeak {
    public String toHexspeak(String num) {
        String retString = Long
                .toHexString(Long.parseLong(num))
                .toUpperCase()
                .replace('0','O')
                .replace('1','I');


        for(int i=0;i< retString.length();i++) {
            if (retString.charAt(i)=='A' || retString.charAt(i)=='B' || retString.charAt(i)=='C' ||
                    retString.charAt(i)=='D' || retString.charAt(i)=='E' || retString.charAt(i)=='F' ||
                    retString.charAt(i)=='I' || retString.charAt(i)=='O') {
                continue;
            } else {
                return "ERROR";
            }
        }
        return retString;
    }

    public static void main(String[] args) {
        System.out.println(new HexSpeak().toHexspeak("257"));
        System.out.println(new HexSpeak().toHexspeak("3"));
        System.out.println(new HexSpeak().toHexspeak("619879596177"));
    }
}
