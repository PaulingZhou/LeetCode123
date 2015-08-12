import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		TreeNode head = new TreeNode(1);
		TreeNode first1 = new TreeNode(2);
		TreeNode first2 = new TreeNode(3);
		TreeNode second1 = new TreeNode(4);
		TreeNode second2 = new TreeNode(5);
		TreeNode third1 = new TreeNode(6);
		head.left = first1;
		head.right = first2;
		first1.left = second1;
		first2.right = second2;
		second1.right = third1;
		List<List<Integer>> list = new LinkedList<List<Integer>>();
		list = new Solution().levelOrder(head);
		for(int i = 0 ; i < list.size() ; i++){
			for(int j = 0 ; j < list.get(i).size() ; j++){
				System.out.print(list.get(i).get(j)+" ");
			}
			System.out.println("");
		}
	}
}
