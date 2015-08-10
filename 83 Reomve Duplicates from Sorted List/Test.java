package com.zhou.source;

public class Test {
	public static void main(String[] args) {
		Solution solution = new Solution();
		ListNode lh = new ListNode(0);
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(1);
		lh.next = l1;
		l1.next = l2;
		ListNode result = solution.deleteDuplicates(lh);
		while(result != null){
			System.out.println(result.val);
			result = result.next;
		}
	}
}
