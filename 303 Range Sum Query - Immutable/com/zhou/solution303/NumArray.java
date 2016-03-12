package com.zhou.solution303;

public class NumArray {
	private int[] numsAdd;
	
    public NumArray(int[] nums) {
        numsAdd = nums;
        for(int i = 1; i < nums.length; i++){
        	numsAdd[i] = numsAdd[i-1] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return i == 0 ? numsAdd[j] : numsAdd[j] - numsAdd[i-1]; 
    }
}
