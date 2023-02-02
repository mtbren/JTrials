package com;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        if (num1.length() > num2.length()){
            StringBuffer num2Buf = new StringBuffer(num2);
            for(int i=0;i<num1.length()- num2.length();i++)
                num2Buf.insert(0,"0");
            num2 = num2Buf.toString();
        }else{
            StringBuffer num1Buf = new StringBuffer(num1);
            for(int i=0;i<num2.length()- num1.length();i++)
                num1Buf.insert(0,"0");
            num1 = num1Buf.toString();
        }
        StringBuffer additionString = new StringBuffer();
        int prevCarry = 0;
        for(int i = num1.length()-1;i>=0;i--){
            int[] addition = addDigits(num1.charAt(i)-48,
                    num2.charAt(i)-48, prevCarry);
            prevCarry = addition[0];
            additionString.insert(0,addition[1]);
        }
        return prevCarry > 0 ? ""+prevCarry+additionString :
                additionString.toString();
    }
    private int[] addDigits(int a, int b, int carry){
        if(a+b+carry > 9)
            return new int[]{1,a+b+carry-10};
        else
            return new int[]{0,a+b+carry};
    }

    public static void main(String[] args) {
        AddStrings as = new AddStrings();
        System.out.println(as.addStrings("11","123")); // 134
        System.out.println(as.addStrings("456","77")); // 533
        System.out.println(as.addStrings("0","0")); // 0
    }

}
