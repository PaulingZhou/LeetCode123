package com.zhou.solution43;

public class Solution {
    public String multiply(String num1, String num2) {
    	int m = num1.length(),n = num2.length();
    	int[] pos = new int[m+n];
    	for(int i = m-1; i >=0; i--){
    		for(int j = n-1; j >=0; j--){
    			int mul = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
    			int p1 = i+j,p2 = i+j+1;
    			int sum = pos[p2] + mul;
    			pos[p2] = sum % 10;
    			pos[p1] += sum/10;
    		}
    	}
    	
    	String result = "";
    	boolean isZero = true;
    	for(int k = 0; k < pos.length; k++){
    		if(pos[k] == 0 && isZero) continue;
    		if(pos[k] != 0 || !isZero){
    			result += pos[k];
    			isZero = false;
    		}
    	}
    	return result.length() == 0 ? "0" : result;
    }
}
