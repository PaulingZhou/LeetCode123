package com.zhou.solution169;

import java.util.ArrayList;

public class Solution {
	public int majorityElement(int[] nums){
		ArrayList<Integer> numList = new ArrayList<Integer>();
		ArrayList<Integer> countList = new ArrayList<Integer>();
		for(int i = 0 ; i < nums.length; i++){
			if(numList.contains(nums[i]))
				countList.set(numList.indexOf(nums[i]), countList.get(numList.indexOf(nums[i]))+1);
			else{
				countList.add(1);
				numList.add(nums[i]);
			}
		}
		for(int i = 0; i < countList.size(); i++){
			if(countList.get(i) > nums.length/2)return numList.get(i);
		}
		return 0;
	}
}

