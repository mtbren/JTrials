package com;

public class Maximum69Number {
    public int maximum69Number (int num) {
        String numStr = Integer.toString(num);
        StringBuffer newStr = new StringBuffer();
        boolean flipped = false;
        for(int i=0;i<numStr.length();i++){
            if(!flipped){
                if(numStr.charAt(i)=='6'){
                    newStr = newStr.append('9');
                    flipped = true;
                }else{
                    newStr = newStr.append('9');
                }
            }else{
                newStr = newStr.append(numStr.charAt(i));
            }
        }
        return Integer.parseInt(newStr.toString());
    }

    public static void main(String[] args) {
        Maximum69Number max69 = new Maximum69Number();
        System.out.println(max69.maximum69Number(9669));
        System.out.println(max69.maximum69Number(9969));
    }
}
