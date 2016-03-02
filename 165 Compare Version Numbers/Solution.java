package com.zhou.solution165;

public class Solution {
	public int compareVersion(String version1, String version2){
		String[] version1Array = version1.split("//.");
		String[] version2Array = version2.split("//.");
		int maxLength = Math.max(version1Array.length, version2Array.length);
		for(int i = 0; i < maxLength; i++){
			Integer v1 = version1Array.length > i ? Integer.parseInt(version1Array[i]) : 0;
			Integer v2 = version2Array.length > i ? Integer.parseInt(version2Array[i]) : 0;
			int compare = v1.compareTo(v2);
			if(compare != 0) return compare;
		}
		return 0;
	}
}
