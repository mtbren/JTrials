package com;

public class MaxStack {
    private int[] stack;
    int topValue;
    int topValueIndex;
    int lastValueIndex;

    public MaxStack() {
        stack = new int[100000];
        topValue = Integer.MIN_VALUE;
        topValueIndex = -1;
        lastValueIndex = -1;
        for(int i=0;i<stack.length;i++){
            stack[i]=Integer.MIN_VALUE;
        }
    }

    public void push(int x) {
        stack[++lastValueIndex] = x;
        if (x >= topValue) {
            topValue = x;
            topValueIndex = lastValueIndex;
        }
    }

    public int pop() {
        int temp = stack[lastValueIndex];
        lastValueIndex--;
        while(lastValueIndex>=0 && stack[lastValueIndex]==Integer.MIN_VALUE)
            lastValueIndex--;
        topValue = Integer.MIN_VALUE;
        for(int i=0;i<=lastValueIndex;i++){
            if(topValue <= stack[i]){
                topValue = stack[i];
                topValueIndex = i;
            }
        }
        return temp;
    }

    public int top() {
        return stack[lastValueIndex];
    }

    public int peekMax() {
        return topValue;
    }

    public int popMax() {
        int temp = stack[topValueIndex];
        while(topValueIndex == lastValueIndex || (lastValueIndex>=0 && stack[lastValueIndex] == Integer.MIN_VALUE))
            lastValueIndex--;
        stack[topValueIndex]=Integer.MIN_VALUE;
        topValue = Integer.MIN_VALUE;
        for(int i=0;i<=lastValueIndex;i++){
            if(topValue <= stack[i]){
                topValue = stack[i];
                topValueIndex = i;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        MaxStack max = new MaxStack();
        max.push(74);
        System.out.println(max.popMax());   //74
        max.push(89);max.push(67);
        System.out.println(max.popMax());   //89
        System.out.println(max.pop());      //67
        max.push(61);max.push(-77);
        System.out.println(max.peekMax());  //61
        System.out.println(max.popMax());   //61
        max.push(81);
        System.out.println(max.pop());      //81
        max.push(-71);max.push(32);

        /*max.push(5);max.push(1);
        System.out.println(max.popMax());   //5
        System.out.println(max.peekMax());  //1*/


        /*max.push(5);max.push(1);max.push(5);
        System.out.println(max.top());      //5
        System.out.println(max.popMax());   //5
        System.out.println(max.top());      //1
        System.out.println(max.peekMax());  //5
        System.out.println(max.pop());      //1
        System.out.println(max.top());      //5*/

        /*max.push(5);
        System.out.println(max.peekMax());  //5
        System.out.println(max.popMax());   //5*/
    }
}
