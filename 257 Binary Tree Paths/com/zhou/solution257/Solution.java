package com.zhou.solution257;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
    	List<String> answer = new ArrayList<String>();
    	if(root != null)searchBT(root, "", answer);
    	return answer;
    }
    
    private void searchBT(TreeNode node, String path, List<String> answer){
    	if(node.left==null && node.right==null) answer.add(path+node.val);
    	if(node.left != null)searchBT(node.left, path+node.val+"->", answer);
    	if(node.right != null)searchBT(node.right, path+node.val+"->", answer);
    }
}
