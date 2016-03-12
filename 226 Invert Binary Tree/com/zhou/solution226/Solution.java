package com.zhou.solution226;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null || (root.left==null && root.right==null)) return root;
        TreeNode tempNode = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tempNode);
        return root;
    }
}
