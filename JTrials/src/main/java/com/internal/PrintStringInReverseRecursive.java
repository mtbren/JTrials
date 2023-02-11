package com.internal;

public class PrintStringInReverseRecursive {
    private static void printReverse(char [] str) {
        printHelper(str, str.length-1);
        System.out.println();
        printHelper2(str, 0);
    }
    private static void printHelper(char[] str, int currInd){
        if (currInd < 0)
            return;
        System.out.print(str[currInd]);
        printHelper(str,--currInd);
    }
    private static void printHelper2(char[] str, int index){
        if(index >= str.length)
            return;
        printHelper2(str, index+1);
        System.out.print(str[index]);
    }

    public static void main(String[] args) {
        PrintStringInReverseRecursive.printReverse(new char[]{'a','m','i','t'});
    }
}
