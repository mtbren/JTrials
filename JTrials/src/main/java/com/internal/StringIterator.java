package com.internal;

public class StringIterator {
    private String compressedString;
    private int alphPtr = 0;
    private int numPtr = 0;
    private int occurrences = 0;

    public StringIterator(String compressedString) {
        this.compressedString = compressedString;
    }

    public char next() {
        if(numPtr>compressedString.length()){
            return ' ';
        }
        StringBuilder strnum = new StringBuilder();

        if(occurrences==0 && compressedString.charAt(numPtr)>47
                && compressedString.charAt(numPtr)<58) {
            while (numPtr < compressedString.length() && compressedString.charAt(numPtr) > 47
                    && compressedString.charAt(numPtr) < 58) {
                strnum.append(compressedString.charAt(numPtr));
                numPtr++;
            }
            occurrences = Integer.parseInt(strnum.toString());
        }
        if(occurrences>0){
            occurrences--;
        }

        if(occurrences==0){
            alphPtr=numPtr;
            numPtr++;
        }
        if(alphPtr<compressedString.length()) {
            return compressedString.charAt(alphPtr);
        }else{
            return ' ';
        }
    }

    public boolean hasNext() {
        if(occurrences>1 ||
                (numPtr<compressedString.length()-1 && alphPtr<compressedString.length()-1)){
            return true;
        }else{
            return false;
        }

    }

    public static void main(String[] args) {
        int a = 'a';
        int A = 'A';
        int z = '0';
        int n = '9';
        System.out.println(""+a+" "+A+" "+z+" "+n);
        //StringIterator stringIterator = new StringIterator("L1e2t1C1o1d1e1");
        StringIterator stringIterator = new StringIterator("x6");
        System.out.println(stringIterator.next()); // return "L"
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.hasNext()); // return True
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.next()); // return "C"
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.hasNext()); // return True
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.hasNext()); // return True
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.hasNext()); // return False
        System.out.println(stringIterator.next());
        System.out.println(stringIterator.next());
    }
}
