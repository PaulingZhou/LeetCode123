package com.zhou.remove_duplicates_from_sorted_array;

//import java.util.Stack;

public class Solution {
	public int removeDuplicates(int[] nums) {
		if(nums == null)return 0;
		int length = nums.length;
		if(length < 2) return length;
		//using array to solve the problem
		int fast = 1 , slow = 1;
		for(int i = 1 ; i < length ; i++){
			if(nums[i-1] != nums[i]){
				nums[slow++] = nums[fast];
			}
			fast++;
		}
		return slow;
		//using stack to solve the problem
		//meeting RunTime Error while testing in LeetCode
		/*Stack<Integer> stack = new Stack<Integer>();
		int length = nums.length;
		for(int i = 0 ; i < length ; i++){
			if(stack.empty() || nums[i] != stack.peek()){
				stack.push(nums[i]);
			}
		}
		int count = 0;
		while(!stack.empty()){
			nums[count] = stack.pop();
			count++;
		}
		return count+1;*/
	}
}
