package com.internal;

public class RotateListToRight {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tmpPtr = head;
        ListNode prevPtr = head;
        ListNode nextPtr = head.next;

        int size = 0;
        while(tmpPtr != null){
            size ++;
            tmpPtr = tmpPtr.next;
        }
        k = k % size;

        for(int i=0;i<k;){
            nextPtr = nextPtr.next;
            if(nextPtr == null){
                // You have reached the end of the List and PrevPtr is the second to last node now
                ListNode tempHead = prevPtr.next;
                prevPtr.next = null;
                tempHead.next = head;
                head = tempHead;
                prevPtr = head;
                nextPtr = head.next;
                i++;
            }else {
                prevPtr = prevPtr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        new RotateListToRight().rotateRight(
                new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2);

        new RotateListToRight().rotateRight(
                new ListNode(0,new ListNode(1, new ListNode(2))), 4);
    }
}
