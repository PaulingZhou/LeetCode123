package com.zhou.solution234;

public class Solution {
    public boolean isPalindrome(ListNode head) {
        int count = 0;
        ListNode nodeCount = head;
        ListNode reverseNode = head;
        while(nodeCount != null) {
        	count++;
        	nodeCount = nodeCount.next;
        }
        for(int i = 0; i < (count+1)/2; i++) reverseNode = reverseNode.next;
        ListNode judgeNode = reverseList(reverseNode);
        while(judgeNode != null){
        	if(head.val != judgeNode.val)return false;
        	head = head.next;
        	judgeNode = judgeNode.next;
        }
        return true;
    }
    
    public ListNode reverseList(ListNode head){
    	ListNode next = null;
    	ListNode newHead = null;
    	while(head != null){
    		next = head.next;
    		head.next = newHead;
    		newHead = head;
    		head = next;
    	}
    	return newHead;
    }
}
