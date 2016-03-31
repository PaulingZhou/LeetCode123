package com.zhou.solution40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		if (candidates.length == 0)
			return ans;
		Arrays.sort(candidates);
		List<Integer> oneCombination = new ArrayList<>();
		getCombinationAns(ans, oneCombination, candidates, target, 0);
		return ans;
	}

	private void getCombinationAns(List<List<Integer>> ans, List<Integer> cur, int[] candidates, int target,
			int offset) {
		if (target == 0) {
			ans.add(new ArrayList<Integer>(cur));
			return;
		}
		if(target < 0) return;
		if (target > 0) {
			for (int i = offset; i < candidates.length; i++) {
				if(i > offset && candidates[i] == candidates[i-1]) continue;
				target -= candidates[i];
				cur.add(candidates[i]);
				getCombinationAns(ans, cur, candidates, target, i + 1);
				target += candidates[i];
				cur.remove(cur.size() - 1);
			}
		}
	}
}
