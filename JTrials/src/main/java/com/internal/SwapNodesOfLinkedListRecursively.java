package com.internal;

public class SwapNodesOfLinkedListRecursively {
    public ListNode swapPairs(ListNode head) {
        ListNode newHead = swapPairsRecursive(head);
        return newHead;
    }
    private ListNode swapPairsRecursive(ListNode head){
        if(head == null){
            return null;
        }else if (head.next == null){
            return head;
        }
        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;

        head.next = swapPairsRecursive(head.next);
        return temp;
    }

    public static void main(String[] args) {
        new SwapNodesOfLinkedListRecursively().swapPairs(new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4)))));
        new SwapNodesOfLinkedListRecursively().swapPairs(new ListNode(1,new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))));
    }
}
