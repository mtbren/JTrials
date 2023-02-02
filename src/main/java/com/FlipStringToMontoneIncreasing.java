package com;

public class FlipStringToMontoneIncreasing {
    public int minFlipsMonoIncr(String s) {
        int ans = 0, num1 = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                num1++;
            }else{
                ans = Math.min(num1, ans+1);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new FlipStringToMontoneIncreasing().
                minFlipsMonoIncr("0101100011")); //3
        System.out.println(new FlipStringToMontoneIncreasing().
                minFlipsMonoIncr("00110")); //1
        System.out.println(new FlipStringToMontoneIncreasing().
                minFlipsMonoIncr("010110")); //2
        System.out.println(new FlipStringToMontoneIncreasing().
                minFlipsMonoIncr("00011000")); //2



    }
}
