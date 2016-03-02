package com.zhou.solution189;

public class Solution {
	public void rotate(int[] nums,int k){
		k = k % nums.length;
		int[] tempNum = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			tempNum[i] = i < k ? nums[nums.length - k + i] : nums[i - k];
		for (int i = 0; i < nums.length; i++)
			nums[i] = tempNum[i];
	}
}
