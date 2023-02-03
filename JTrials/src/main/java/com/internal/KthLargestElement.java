package com.internal;

import java.util.Arrays;
import java.util.Stack;

public class KthLargestElement {
    private int kth;
    private Stack<Integer> kStack = new Stack<>();
    private Stack<Integer> tempStack = new Stack<>();
    private boolean kthHasBeenSet = false;
    private int k;
    public KthLargestElement(int k, int[] nums) {
        this.k = k;
        if(nums.length==0) {
            //kth = -k;
            return;
        }
        Arrays.sort(nums);
        if(k<=nums.length) {
            kth = nums[nums.length - k];
            kthHasBeenSet = true;
        }
        if(nums.length > k) {
            for (int i = nums.length - 1; i >= nums.length - k; i--)
                kStack.push(nums[i]);
        }else{
            for (int i = nums.length - 1; i >= 0; i--)
                kStack.push(nums[i]);
        }
    }

    public int add(int val) {

        if((val>kth  && kthHasBeenSet) || !kthHasBeenSet){
            while(!kStack.isEmpty() && val>kStack.peek()){
                tempStack.push(kStack.pop());
            }
            kStack.push(val);
            while(tempStack.size()>1){
                kStack.push(tempStack.pop());
            }
            if(!tempStack.isEmpty()) {
                if (kthHasBeenSet) {
                    tempStack.pop();
                } else {
                    kStack.push(tempStack.pop());
                }
            }
            kth=kStack.peek();
            kthHasBeenSet = true;
        }
        return kth;
    }

    public static void main(String[] args) {
        KthLargestElement kth = new KthLargestElement(2,new int[]{0});
        /*System.out.println(kth.add(-1)); //-1
        System.out.println(kth.add(1)); //0
        System.out.println(kth.add(-2)); //0
        System.out.println(kth.add(-4)); //0
        System.out.println(kth.add(3)); //1*/


/*        kth = new KthLargestElement(1,new int[]{});
        System.out.println(kth.add(-3)); //-3
        System.out.println(kth.add(-2)); //-2
        System.out.println(kth.add(-4)); //-2
        System.out.println(kth.add(0)); //0
        System.out.println(kth.add(4)); //4

        kth = new KthLargestElement(3,new int[]{4,5,8,2});
        System.out.println(kth.add(3)); //4
        System.out.println(kth.add(5)); //5
        System.out.println(kth.add(10));//5
        System.out.println(kth.add(9)); //8
        System.out.println(kth.add(4)); //8
*/
        kth = new KthLargestElement(1,new int[]{2});
        System.out.println(kth.add(3)); //3
        System.out.println(kth.add(5)); //5
        System.out.println(kth.add(10));//10
        System.out.println(kth.add(9)); //10
        System.out.println(kth.add(4)); //10

    }
}
