import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
    	Queue<TreeNode> queue = new LinkedList<TreeNode>();
    	List<List<Integer>> list = new LinkedList<List<Integer>>();
    	if(root == null)return list;
    	
    	queue.offer(root);
    	
    	while(!queue.isEmpty()){
    		int queueNum = queue.size();
    		List<Integer> subList = new LinkedList<Integer>();
    		for(int i = 0 ; i < queueNum ; i++){
    			if(queue.peek().left != null)queue.offer(queue.peek().left);
    			if(queue.peek().right != null)queue.offer(queue.peek().right);
    			int val = queue.poll().val;
    			subList.add(val);
    		}
    		list.add(subList);
    	}
		return list;   
    }
}