package com.zhou.solution202;

import java.util.HashSet;

public class Solution {
    public boolean isHappy(int n) {
    	int opNum = n,tempNum = 0;;
        HashSet<Integer> s = new HashSet<Integer>();
        while(s.add(opNum)){
        	tempNum = 0;
        	while(opNum != 0){
        		tempNum = tempNum + (opNum % 10) * (opNum % 10);
        		opNum = opNum/10;
        	}
        	if(tempNum == 1) return true;
        	opNum = tempNum;
        }
        return false;
    }
}
