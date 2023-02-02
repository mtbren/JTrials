package com;

import java.util.ArrayList;
import java.util.List;

public class BinaryPrefixDivisibleBy5 {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        StringBuffer sBfr = new StringBuffer();
        List<Boolean> retList = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            sBfr.append(nums[i]);
            System.out.println(sBfr);
            int flag = 0;
            if(i>5){
                if(retList.get(i-1)==true && nums[i]==0)
                    retList.add(true);
                else if(nums[i]==1 && nums[i-1]==0 && nums[i-2]==1)
                    retList.add(true);
                else
                    retList.add(false);
            }else{
                if(Integer.parseInt(sBfr.toString(),2)%5==0)
                    retList.add(true);
                else
                    retList.add(false);
            }

        }
        return retList;
    }

    public static void main(String[] args) {
        BinaryPrefixDivisibleBy5 bpd5 = new BinaryPrefixDivisibleBy5();
        bpd5.prefixesDivBy5(new int[]{0,1,1});
        bpd5.prefixesDivBy5(new int[]{1,1,1});
        bpd5.prefixesDivBy5(new int[]{1,0,1});
        bpd5.prefixesDivBy5(new int[]{1,0,1,0});
        bpd5.prefixesDivBy5(new int[]{1,0,1,0,0});
        bpd5.prefixesDivBy5(new int[]{1,0,1,0,0,1});
        bpd5.prefixesDivBy5(new int[]{1,0,1,0,0,1,0});
        bpd5.prefixesDivBy5(new int[]{1,0,1,0,0,1,0,1});
    }
}