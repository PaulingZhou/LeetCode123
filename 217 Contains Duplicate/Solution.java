package com.zhou.solution217;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> s = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
        	if(!s.add(nums[i]))return true;
        }
        return false;
    }
}
