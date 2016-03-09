package com.zhou.solution190;

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
    	int result = 0;
    	int count = 32;
    	while((count--) != 0){
    		result += n & 1;
    		n >>>= 1;
    		if(count > 1) result <<= 1;
    	}
    	return result;
    }
}
