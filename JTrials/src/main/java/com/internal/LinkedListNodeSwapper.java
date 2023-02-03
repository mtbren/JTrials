package com.internal;

public class LinkedListNodeSwapper {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode origHead = head;
        ListNode firstPtr = head, secondPtr = null;
        ListNode nodeToSwap1 = head, nodeToSwap2 = null;

        if(firstPtr==null)
            return null;

        int counter=1;
        while(firstPtr != null){
            if(counter == k){
                nodeToSwap1 = firstPtr;
                secondPtr = head;
            }else{
                if(secondPtr != null){
                    secondPtr = secondPtr.next;
                }
            }
            counter++;
            firstPtr = firstPtr.next;

            if(firstPtr == null && nodeToSwap1 != null){
                nodeToSwap2 = secondPtr;
                if(nodeToSwap2!=null){
                    int temp = nodeToSwap1.val;
                    nodeToSwap1.val = nodeToSwap2.val;;
                    nodeToSwap2.val = temp;
                }
                break;
            }
        }
        return origHead;
    }
}
