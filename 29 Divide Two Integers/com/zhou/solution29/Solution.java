package com.zhou.solution29;

import java.util.Stack;

public class Solution {
    public int divide(int dividend, int divisor) {
    	int result = 0;
    	boolean isPositive = (dividend > 0 && divisor > 0) || (dividend < 0 && divisor < 0) ? true : false;
    	Long dividendLong = (long)dividend ;Long divisorLong = (long)divisor;
    	dividendLong = dividendLong > 0 ? dividendLong : -dividendLong;
    	if(dividendLong > Integer.MAX_VALUE && isPositive) return dividend;
    	divisorLong = divisorLong > 0 ? divisorLong : -divisorLong;
    	if(dividendLong < divisorLong) return result;
    	long count = 1, operater = divisorLong;
    	Stack<Long> key = new Stack<>(); Stack<Long> val = new Stack<>();
    	while(count < Integer.MAX_VALUE){
    		if(operater <= dividendLong){
    			key.push(operater); val.push(count);
    			operater = operater + operater;
    			count = count + count;
    			if(count > Integer.MAX_VALUE) return Integer.MAX_VALUE;
    		}else break;
    	}
    	while(!key.isEmpty()){
    		if(key.peek() <= dividendLong){
    			result += val.pop();
    			dividendLong -= key.pop();
    			if(dividendLong == 0) break;
    		}else{
    			key.pop();
    			val.pop();
    		}
    	}
    	return isPositive ? result : -result;
    }
}
