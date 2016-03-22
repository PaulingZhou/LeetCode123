package com.zhou.solution31;

public class Solution {
    public void nextPermutation(int[] nums) {
    	if(nums.length <= 1) return;
    	for(int i = nums.length-2; i >= 0; i--){
    		if(nums[i] >= nums[nums.length-1]){
    			int temp = nums[i];
    			for(int j = i+1; j < nums.length; j++) nums[j-1] = nums[j];
    			nums[nums.length-1] = temp;
    		}else if(nums[i] < nums[nums.length-1]){
    			int temp = nums[i];
    			for(int j = i+1; j < nums.length; j++){
    				if(temp < nums[j]){
    					nums[i] = nums[j];
    					nums[j] = temp;
    					break;
    				}   				
    			}
    			break;
    		}
    	}
    }
}
