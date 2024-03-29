/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
public class Solution {
	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		return isSymmetricHelp(root.left, root.right);
	}

	private boolean isSymmetricHelp(TreeNode left, TreeNode right) {
		if (left == null || right == null)
			return left == null && right == null;
		if(left.val == right.val)
			return isSymmetricHelp(left.left, right.right) 
				    && isSymmetricHelp(left.right, right.left);
		return false;
	}
}
