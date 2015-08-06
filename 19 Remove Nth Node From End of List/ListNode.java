public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public void print(){
    	if(next != null){
    		System.out.print(val + "-->");
    		next.print();
    	}
    	else System.out.println(val);
    }
}