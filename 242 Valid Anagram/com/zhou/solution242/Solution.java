package com.zhou.solution242;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isAnagram(String s, String t) {
    	if(s.length() != t.length()) return false;
        List<Character> charList = new ArrayList<Character>();
        List<Integer> charCountList = new ArrayList<Integer>();
        for(int i = 0; i < s.length(); i++){
        	if(!charList.contains(s.charAt(i))){
        		charList.add(s.charAt(i));
        		charCountList.add(1);
        	}
        	else{
        		charCountList.set(charList.indexOf(s.charAt(i)), charCountList.get(charList.indexOf(s.charAt(i)))+1);
        	}
        }
        for(int j = 0; j < t.length(); j++){
        	if(!charList.contains(t.charAt(j))) return false;
        	else{
        		int charCount = charCountList.get(charList.indexOf(t.charAt(j)));
        		if(charCount == 0) return false;
        		else charCountList.set(charList.indexOf(t.charAt(j)), charCount-1);
        	}
        }
        return true;
    }
}
