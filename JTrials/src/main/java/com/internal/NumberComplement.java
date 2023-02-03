package com.internal;

public class NumberComplement {
    private static int findComplement(int num) {
        String numBin = Integer.toBinaryString(num);
        StringBuffer numBinComplement = new StringBuffer();
        for(int i=0;i<numBin.length();i++){
            if(numBin.charAt(i)=='1'){
                numBinComplement.append('0');
            }else if(numBin.charAt(i)=='0'){
                numBinComplement.append('1');
            }
        }
        int complement = Integer.parseInt(numBinComplement.toString(),2);
        return complement;
    }

    public static void main(String[] args) {
        System.out.println(findComplement(5));
        System.out.println(findComplement(1));
    }
}
