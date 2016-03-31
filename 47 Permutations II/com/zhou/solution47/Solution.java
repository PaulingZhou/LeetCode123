package com.zhou.solution47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> permuteUnique(int[] nums){
		List<List<Integer>> ans = new ArrayList<>();
		if(nums.length == 0) return ans;
		Arrays.sort(nums);
		ans.add(Arrays.asList(nums[0]));
		getResult(ans,nums,1);
		return ans;
	}

	private void getResult(List<List<Integer>> ans, int[] nums, int offset) {
		if(offset >= nums.length) return;
		while(ans.get(0).size() == offset){
			List<Integer> numberSequence = ans.remove(0);
			for(int i = 0; i <= numberSequence.size(); i++){
				List<Integer> insertSequence = new ArrayList<>();
				insertSequence.addAll(numberSequence);
				if((nums[offset] != nums[offset-1]) || (nums[offset] == nums[offset-1] && i > insertSequence.lastIndexOf(nums[offset]))){
					insertSequence.add(i,nums[offset]);
					ans.add(insertSequence);
				}
			}
		}
		getResult(ans,nums,offset+1);
	}
}
