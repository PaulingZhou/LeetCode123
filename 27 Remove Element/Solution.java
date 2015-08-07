public class Solution {
    public int removeElement(int[] nums, int val) {
		int count = 0;
		for(int i = 0 ; i < nums.length ; i++){
			if(nums[i] != val)nums[count++] = nums[i];
		}
		for(int i = 0 ; i < count ; i++)System.out.println(nums[i]);
    	return count;  
    }
}
