package com.zhou.solution18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> ans = new ArrayList<>();
    	if(nums.length == 0) return ans;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-3; i++){
        	if(i > 0 && nums[i] == nums[i-1]) continue;
        	if(nums[i] + 3 * nums[nums.length-1] < target) continue;	//too small
        	if(4 * nums[i] > target) break;								//too big
        	int targetFor3Sum = target - nums[i];
        	for(int j = i+1; j < nums.length-2; j++){
        		if(j > i+1 && nums[j] == nums[j-1]) continue;
        		if(nums[j] + 2 * nums[nums.length-1] < targetFor3Sum) continue;		//too small
        		if(3 * nums[j] > targetFor3Sum) break;								//too big
        		int targetFor2Sum = targetFor3Sum - nums[j];
        		int start2Sum = j+1,end2Sum = nums.length-1;
        		while(start2Sum < end2Sum){
            		if(nums[start2Sum] + nums[end2Sum] == targetFor2Sum){
            			ans.add(Arrays.asList(nums[i],nums[j],nums[start2Sum],nums[end2Sum]));
            			while(start2Sum < end2Sum && nums[start2Sum] == nums[start2Sum+1]) start2Sum++;
            			while(start2Sum < end2Sum && nums[end2Sum] == nums[end2Sum-1]) end2Sum--;
            			start2Sum++;end2Sum--;
            		}else{
            			if(nums[start2Sum] + nums[end2Sum] < targetFor2Sum) start2Sum++;
            			if(nums[start2Sum] + nums[end2Sum] > targetFor2Sum) end2Sum--;
            		}
        		}
        	}
        }
        return ans;
    }
}
