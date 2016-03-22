package com.zhou.solution17;

import java.util.*;

public class Solution {
    public List<String> letterCombinations(String digits) {
    	LinkedList<String> ans = new LinkedList<String>();
    	if(digits.equals("")) return ans;
    	String[] mapping = new String[]{"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    	ans.add("");
    	for(int i = 0; i < digits.length(); i++){
    		int num = Character.getNumericValue(digits.charAt(i));
    		while(ans.peek().length() == i){
    			String t = ans.remove();
    			for(char c : mapping[num].toCharArray())
    				ans.add(t+c);
    		}
    	}
    	return ans;
    }
}
