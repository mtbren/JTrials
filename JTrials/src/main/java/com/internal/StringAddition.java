package com.internal;

public class StringAddition {
    private static String addStrings(String  num1, String num2){
        int num1Ptr , num2Ptr ;

        num1Ptr = num1.length()-1;
        num2Ptr = num2.length()-1;

        StringBuffer bufFinal = new StringBuffer();

        int carry = 0;
        int addition = 0, digit =0;
        while(num1Ptr > -1 && num2Ptr > -1){
            addition = Integer.parseInt(""+num1.charAt(num1Ptr)) +
                    Integer.parseInt(""+num2.charAt(num2Ptr)) + carry;
            if(addition > 9){
                digit = addition - 10;
                carry = 1;
            }else{
                digit = addition;
                carry = 0;
            }

            bufFinal.insert(0, digit);
            num1Ptr--;
            num2Ptr--;
        }

        if(num1.length() > num2.length()){
            while(num1Ptr > -1){
                addition = Integer.parseInt(""+num1.charAt(num1Ptr))+carry;
                if(addition > 9){
                    digit = addition - 10;
                    carry = 1;
                }else{
                    digit = addition;
                    carry = 0;
                }

                bufFinal.insert(0, digit);
                num1Ptr--;
            }
        }else if(num1.length() < num2.length()){
            while(num2Ptr > -1){
                addition = Integer.parseInt(""+num2.charAt(num2Ptr))+carry;
                if(addition > 9){
                    digit = addition - 10;
                    carry = 1;
                }else{
                    digit = addition;
                    carry = 0;
                }

                bufFinal.insert(0, digit);
                num2Ptr--;
            }
        }
        if(carry > 0)
            bufFinal.insert(0, carry);

        return bufFinal.toString();
    }

    public static void main(String[] args) {
        System.out.println(addStrings("123","5")); //128
        System.out.println(addStrings("123","9")); //132
        System.out.println(addStrings("999999","9")); //1000008
        System.out.println(addStrings(""+Integer.MAX_VALUE,"0")); //2147483647
        System.out.println(addStrings(""+Integer.MAX_VALUE,"3")); //2147483650
        System.out.println(addStrings("3",""+Integer.MAX_VALUE)); //2147483650
    }
}
