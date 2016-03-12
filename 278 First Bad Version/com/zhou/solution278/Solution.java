package com.zhou.solution278;

public class Solution {
    public int firstBadVersion(int n) {
        int head = 1,end = n;
        while(head < end){
        	int mid = head + (end-head)/2;
        	if(isBadVersion(mid)) end = mid;
        	else head = mid+1;
        }
        return head;
    }
    
    private boolean isBadVersion(int version){
    	return true;
    }
}
