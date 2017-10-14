public class Solution {
    private int result = 0;
    public int sumNumbers(TreeNode root) {
        if(root != null) sumNumbers(root, 0);
        return  result;
    }

    private void sumNumbers(TreeNode node, int acc) {
        acc = acc*10+node.val;
        if(node.left == null && node.right == null) result += acc;
        if(node.left != null) sumNumbers(node.left, acc);
        if(node.right != null) sumNumbers(node.right, acc);
    }
}
