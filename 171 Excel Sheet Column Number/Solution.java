package com.zhou.solution171;

public class Solution {
	public int titleToNumber(String s){
		char[] titleArray = s.toCharArray();
		int titleNum = 0;
		for(int i = 0; i < s.length(); i++){
			titleNum = titleNum * 26 + (titleArray[i]-'A'+1);
		}
		return titleNum;
	}
}
