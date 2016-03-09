package com.zhou.solution191;

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        int operation = n;
        while(operation != 0){
        	count += operation & 1;
        	operation >>>= 1;
        }
        return count;
    }
}
