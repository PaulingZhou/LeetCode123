package com.zhou.solution110;

public class Solution {

/*	public boolean isBalanced(TreeNode root){
		if(root == null)return true;
		if(Math.abs(depth(root.left)-depth(root.right))<=1 && isBalanced(root.left) && isBalanced(root.right))return true;
		return false;
	}
	
	public int depth(TreeNode root){
		if(root == null)return 0;
		return Math.max(depth(root.left),depth(root.right));
	}*/
	
	public int dfsHeight(TreeNode root){
		if(root == null)return 0;
		int leftHeight = dfsHeight(root.left);
		if(leftHeight == -1)return -1;
		int rightHeight = dfsHeight(root.right);
		if(rightHeight == -1)return -1;
		
		if(Math.abs(rightHeight-leftHeight) > 1)return -1;
		return(Math.max(leftHeight, rightHeight))+1;
	}
	
	public boolean isBalanced(TreeNode root){
		return dfsHeight(root)!=-1;
	}
}
