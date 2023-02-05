package com.internal;

public class LinkedListBinaryToInteger {
    public int getDecimalValue(ListNode head) {
        StringBuffer strbuf = new StringBuffer();
        while(head != null){
            strbuf.append(head.val);
            head = head.next;
        }

        return Integer.valueOf(strbuf.toString(),2);
    }

    public static void main(String[] args) {
        System.out.println(new LinkedListBinaryToInteger().getDecimalValue(new ListNode(1, new ListNode(0, new ListNode(1)))));
        System.out.println(new LinkedListBinaryToInteger().getDecimalValue(new ListNode(0)));
    }
}
