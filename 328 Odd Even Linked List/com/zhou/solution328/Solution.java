package com.zhou.solution328;

public class Solution {
    public ListNode oddEvenList(ListNode head) {
    	if(head == null) return head;
        ListNode next = head;
        ListNode oddNode = head;
        ListNode firstEvenNode = head.next;
        while(next.next != null && next.next.next != null){
        	next = next.next;
        	oddNode.next = next.next;
        	oddNode = oddNode.next;
        	next.next = oddNode.next;
        	oddNode.next = firstEvenNode;
        }
        return head;
    }
}
