package com.zhou.solution49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
	
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null) return new ArrayList<>();
        Arrays.sort(strs);
        Map<String, List<String>> insertMap = new HashMap<>(); 
        for(String sFromList : strs){
        	char[] ca = sFromList.toCharArray();
        	Arrays.sort(ca);
        	if(!insertMap.containsKey(String.valueOf(ca))) insertMap.put(String.valueOf(ca), new ArrayList<>());
        	insertMap.get(String.valueOf(ca)).add(sFromList);
        }
        return new ArrayList<>(insertMap.values());
    }
}
