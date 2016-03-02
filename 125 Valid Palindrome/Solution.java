package com.zhou.solution125;

import java.util.ArrayList;

public class Solution {
	public boolean isPalindrome(String s){
		if(s == null) return true;
		ArrayList<Character> charArrayList = new ArrayList<Character>();
		for(int i = 0; i < s.length(); i++){
			if((s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9'))charArrayList.add(s.charAt(i));
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')charArrayList.add((char) (s.charAt(i)-('A'-'a')));
		}
		for(int i = 0; i < charArrayList.size()/2; i++){
			if(charArrayList.get(i) != charArrayList.get(charArrayList.size()-1-i)) return false;
		}
		return true;
	}
}
