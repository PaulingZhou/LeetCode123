package com.zhou.solution107;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrderBottom(TreeNode root){
		
		Queue<TreeNode> q = new LinkedList<>();
		LinkedList<List<Integer>> result = new LinkedList<>();
		LinkedList<Integer> rootList = new LinkedList<>();
		
		if(root == null)
			return result;
		rootList.add(root.val);
		result.add(rootList);
		q.add(root);
		while(true){
			Queue<TreeNode> atSameLevel = new LinkedList<>();
			while(!q.isEmpty()){
				TreeNode cur = q.remove();
				if(cur.left != null)atSameLevel.add(cur.left);
				if(cur.right != null)atSameLevel.add(cur.right);
			}
			if(atSameLevel.isEmpty())
				break;
			LinkedList<Integer> valueList=new LinkedList<>();
			for(TreeNode node : atSameLevel) valueList.add(node.val);
			result.addFirst(valueList);;
			q.addAll(atSameLevel);
		}
		return result;
	}
}
