package com.internal;

/*
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
*/
public class MiddleOfALinkedList {
    public ListNode middleNode(ListNode head) {
        if(head == null)
            return null;
        ListNode ptr = head;
        int countNode = 0;
        while(ptr!=null){
            ptr=ptr.next;
            countNode++;
        }
        int mid = countNode/2 + 1;
        ptr = head;
        while(ptr!=null){

            mid --;
            if(mid == 0)
                return ptr;
            ptr=ptr.next;
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(new MiddleOfALinkedList().middleNode(new ListNode(1,
                new ListNode(2,new ListNode(3,new ListNode(4, new ListNode(5))))))
                .val);
        System.out.println(new MiddleOfALinkedList().middleNode(new ListNode(1,
                new ListNode(2,new ListNode(3,new ListNode(4,
                        new ListNode(5, new ListNode(6)))))))
                .val);
        System.out.println(new MiddleOfALinkedList().middleNode(new ListNode(1)).val);
    }
}
