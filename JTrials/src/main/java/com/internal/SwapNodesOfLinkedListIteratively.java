package com.internal;

import java.util.List;

public class SwapNodesOfLinkedListIteratively {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode newHead = head.next;
        ListNode firstNode, secondNode, prevNode=null;
        while(head != null && head.next != null){

            firstNode = head;
            secondNode = head.next;

            firstNode.next = secondNode.next;
            secondNode.next = firstNode;
            if(prevNode!=null)
                prevNode.next = secondNode;

            prevNode = firstNode;
            head = firstNode.next;

        }
        return newHead;
    }

    public static void main(String[] args) {
        new SwapNodesOfLinkedListIteratively().swapPairs(new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6)))))));
        new SwapNodesOfLinkedListIteratively().swapPairs(new ListNode(1,new ListNode(2,new ListNode(3, new ListNode(4)))));
    }
}
