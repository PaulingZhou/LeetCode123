package com.zhou.solution46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if(nums.length == 0)return result;
		result.add(Arrays.asList(nums[0]));
		getResult(result,nums,1);
		return result;
	}

	private void getResult(List<List<Integer>> result, int[] nums, int offset) {
		if(offset >= nums.length) return;
		while(result.get(0).size() == offset){
			List<Integer> integerSequence = result.remove(0);
			for(int i = 0; i <= integerSequence.size(); i++){
				List<Integer> insertSequence = new ArrayList<>();
				insertSequence.addAll(integerSequence);
				insertSequence.add(i, nums[offset]);
				result.add(insertSequence);
			}
		}
		getResult(result, nums, offset+1);
	}
	
}
