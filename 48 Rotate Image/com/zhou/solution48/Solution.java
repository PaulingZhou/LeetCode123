package com.zhou.solution48;

public class Solution {
    public void rotate(int[][] matrix) {
        mirrorChange(matrix);
        upDownChange(matrix);
    }

	private void mirrorChange(int[][] matrix) {
		for(int i = 0; i < matrix.length-1; i++){
			for(int j = 0; j < matrix.length - i; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length-j-1][matrix.length-i-1];
				matrix[matrix.length-j-1][matrix.length-i-1] = temp;
			}
		}
	}
	
	private void upDownChange(int[][] matrix) {
		for(int i = 0; i < matrix.length/2; i++){
			for(int j = 0; j < matrix.length; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[matrix.length-i-1][j];
				matrix[matrix.length-i-1][j] = temp;			
			}
		}
	}
}
