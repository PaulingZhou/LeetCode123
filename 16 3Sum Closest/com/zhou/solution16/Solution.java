package com.zhou.solution16;

import java.util.Arrays;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = Math.abs(nums[0] + nums[1] + nums[2] - target);
        for(int i = 0; i < nums.length; i++){
        	int targetLeft = target - nums[i];
        	int left = i+1,right = nums.length-1;
        	while(left < right){
        		result = Math.abs(result) < Math.abs(targetLeft - nums[left] - nums[right]) ? result : targetLeft - nums[left] - nums[right];
        		if(nums[left] + nums[right] == targetLeft) return target;
        		else if(nums[left] + nums[right] < targetLeft) left++;
        		else right--;
        	}
        }
        return target - result;
    }
}
