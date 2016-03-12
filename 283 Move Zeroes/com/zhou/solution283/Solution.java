package com.zhou.solution283;

public class Solution {
    public void moveZeroes(int[] nums) {
        int firstZero = 0;
        boolean getZero = false;
        for(int i = 0; i < nums.length; i++){
        	if(nums[i] == 0&& !getZero){
        		firstZero = i;
        		getZero = true;
        	}
        	if(nums[i] != 0 && getZero){
        		nums[firstZero] = nums[i];
        		nums[i] = 0;
        		getZero = false;
        		i = firstZero;
        	}
        }
    }
}
