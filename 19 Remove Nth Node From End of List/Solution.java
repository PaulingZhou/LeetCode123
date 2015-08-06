/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode start = new ListNode(0);
    	ListNode fast = start,slow = start;
    	start.next = head;
    	for(int i = 0;i <= n;i++){
    		fast = fast.next;
    	}
    	while(fast != null){
    		fast = fast.next;
    		slow = slow.next;
    	}
    	slow.next = slow.next.next;
        //why cann't return head ??
        return start.next;
    }
}