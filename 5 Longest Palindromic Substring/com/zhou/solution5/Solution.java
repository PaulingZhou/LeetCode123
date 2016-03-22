package com.zhou.solution5;

public class Solution {
    public String longestPalindrome(String s) {
    	int length = s.length();
    	int maxLength = 0;
    	int longestBegin = 0;
    	boolean[][] table = new boolean[length][length];
    	for(int i = 0; i < length; i++){
    		table[i][i] = true;
    		maxLength = 1;
    	}
    	for(int i = 0; i < length-1; i++){
    		if(s.charAt(i) == s.charAt(i+1)) {
    			table[i][i+1] = true;
    			maxLength = 2;
    			longestBegin = i;
    		}
    	}
    	for(int n = 3; n <= length; n++){
    		for(int i = 0; i < length-n+1; i++){
    			int j = i + n -1;
    			if(s.charAt(i) == s.charAt(j) && table[i+1][j-1]){
    				table[i][j] = true;
    				longestBegin = i;
    				maxLength = n;
    			}
    		}
    	}
    	return s.substring(longestBegin, longestBegin+maxLength);
    }
}
