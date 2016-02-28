package com.zhou.solution111;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int minDepth(TreeNode root){
		int minDepth = 0;
		if(root == null) return minDepth;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		while(true){
			Queue<TreeNode> qAtSameLevel = new LinkedList<TreeNode>();
			minDepth++;
			while(!q.isEmpty()){
				TreeNode cNode = q.poll();
				if(cNode.left != null) qAtSameLevel.add(cNode.left);
				if(cNode.right != null) qAtSameLevel.add(cNode.right);
				if(cNode.left == null && cNode.right == null)return minDepth;
			}
			q.addAll(qAtSameLevel);
		}
	}
}
