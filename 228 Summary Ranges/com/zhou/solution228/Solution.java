package com.zhou.solution228;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> rangeList = new ArrayList<String>();
    	if(nums.length == 0) return rangeList;
        int first = nums[0];
        int i;
        for(i = 1; i < nums.length; i++){
        	if((long)nums[i]-nums[i-1] > 1){
        		if(nums[i-1] == first) rangeList.add(""+first);
        		else rangeList.add(first+"->"+nums[i-1]);
        		first = nums[i];
        	}
        }
        if(first == nums[i-1])rangeList.add(""+first);
        else rangeList.add(first+"->"+nums[i-1]);
        return rangeList;
    }
}
