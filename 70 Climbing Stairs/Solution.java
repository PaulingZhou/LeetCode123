package com.zhou.climbing_stairs;

public class Solution {
    public int climbStairs(int n) {
    	int count = 0;
    	if(count <= 2)return count;
    	else{
    		int count0 = 1,count1 = 2;
    		for(int i = 3 ; i <= n; i++){
    			count = count0 + count1;
    			count0 = count1;
    			count1 = count;
    		}
    	}
        return count;
    }
}
