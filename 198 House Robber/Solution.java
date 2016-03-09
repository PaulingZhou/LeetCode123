package com.zhou.solution198;

public class Solution {
    public int rob(int[] nums) {
        int maxValue = 0, lastMaxValue = 0, tempValue = 0;
        for(int i = 0; i < nums.length; i++){
        	tempValue = maxValue;
        	if(nums[i] + lastMaxValue > maxValue) maxValue = lastMaxValue + nums[i];
        	lastMaxValue = tempValue;
        }
        return maxValue;
    }
}
