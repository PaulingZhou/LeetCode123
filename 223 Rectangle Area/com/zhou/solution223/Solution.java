package com.zhou.solution223;

public class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int square = (C-A) * (D-B) + (G-E) * (H-F);
        int left = Math.max(A, E);
        int right = Math.min(G, C);
        int bottom = Math.max(F, B);
        int top = Math.min(D, H);
        if(right>left && top>bottom)
        	square = square - (right-left)*(top-bottom);
        	return square;
    }
}
