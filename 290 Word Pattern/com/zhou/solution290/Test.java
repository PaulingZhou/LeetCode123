package com.zhou.solution290;

public class Test {
	public static void main(String[] args){
		String pattern = "abba";
		String str = "cat dog dog cat";
		Solution s = new Solution();
		System.out.println(""+s.wordPattern(pattern, str));
	}
}
