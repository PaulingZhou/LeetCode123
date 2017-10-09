import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        Queue<Integer> q = new LinkedList<>();
        for(int i = triangle.size()-1; i >= 0; i--) {
            List<Integer> ll = triangle.get(i);
            if(q.isEmpty()) {
                q.addAll(ll);
            }
            else {
                for(int ele: ll) q.add(Math.min(q.poll(), q.peek()) + ele);
                q.poll();
            }
        }
        return q.poll();
    }
}
