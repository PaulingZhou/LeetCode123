package com.zhou.solution290;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean wordPattern(String pattern, String str) {
        char[] patterArray = pattern.toCharArray();
        String[] strArray = str.split(" ");
        if(patterArray.length != strArray.length) return false;
        List<Character> patternList = new ArrayList<Character>();
        List<String> strList = new ArrayList<String>();
        for(int i = 0; i < patterArray.length; i++){
        	if(!patternList.contains(patterArray[i])){
        		if(strList.contains(strArray[i])) return false;
        		else{
        			patternList.add(patterArray[i]);
        			strList.add(strArray[i]);
        		}
        	}
        	else if(patternList.contains(patterArray[i])){
        		if(!strList.get(patternList.indexOf(patterArray[i])).equals(strArray[i])) return false;
        	}
        }
        return true;
        
    }
}
