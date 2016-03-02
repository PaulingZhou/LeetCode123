package com.zhou.solution172;

public class Solution {
	public int trailingZeros(int n){
		int zeroCount = 0;
		int divider = n;
		while(divider != 0)
			zeroCount += (divider/=5);
		return zeroCount;
	}
}
