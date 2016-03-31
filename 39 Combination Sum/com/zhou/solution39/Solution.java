package com.zhou.solution39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        getResult(ans, new ArrayList<Integer>(), candidates, target, 0);
        return ans;
    }
    
    private void getResult(List<List<Integer>>ans, List<Integer> cur, int[] candidate, int target, int offset){
    	if(target > 0){
    		for(int i = offset; i < candidate.length; i++){
    			cur.add(candidate[i]);
    			target-=candidate[i];
    			getResult(ans, cur, candidate, target, i);
    			cur.remove(cur.size()-1);
    			target+=candidate[i];
    		}
    	}
    	else if(target == 0){
    		ans.add(new ArrayList<>(cur));
    	}
    }
}
