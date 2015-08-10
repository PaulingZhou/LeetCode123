package com.zhou.source;

public class Solution {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null) return head;
		ListNode pointer = head;
		while(pointer.next != null){
			//System.out.println(pointer.val);
			if(pointer.val == pointer.next.val)pointer.next = pointer.next.next;
			else pointer = pointer.next;
		}
		return head;
	}
	
}
