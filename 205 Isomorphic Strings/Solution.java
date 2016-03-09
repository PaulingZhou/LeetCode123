package com.zhou.solution205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
    	Map<Character, Character> charMap = new HashMap<Character,Character>();
    	char[] sArray = s.toCharArray();
    	char[] tArray = t.toCharArray();
    	for(int i = 0; i < s.length(); i++){
    		if(charMap.containsKey(sArray[i])){
    			if(charMap.get(sArray[i])!=tArray[i])return false;
    		}else if(!charMap.containsKey(sArray[i])){
    			if(charMap.containsValue(tArray[i]))return false;
    			charMap.put(sArray[i], tArray[i]);
    		}
    	}
    	return true;
    }
}
