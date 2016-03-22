package com.zhou.solution24;

public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode start = new ListNode(0);
        start.next = head;
        head = head.next;
        ListNode end;
        while(start.next != null && start.next.next != null){
        	end = start.next.next;
        	start.next.next = end.next;
        	end.next = start.next;
        	start.next = end;
        	start = end.next;
        }
        return head;
    }
}
