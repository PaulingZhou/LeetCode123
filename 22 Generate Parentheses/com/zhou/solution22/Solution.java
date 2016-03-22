package com.zhou.solution22;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
    	LinkedList<String> ans = new LinkedList<String>();
    	if(n == 0)return ans;
    	ans.add("");
    	for(int i = 1; i <= n; i++){
    		while(ans.peek().length() == 2*(i-1)){
    			String sParenthesis = ans.remove();
    			for(int j = sParenthesis.lastIndexOf("("); j < sParenthesis.length(); j++){
    				ans.add(sParenthesis.substring(0,j+1) + "()" + sParenthesis.substring(j+1));
    			}
    		}
    	}
    	return ans;
    }
}
