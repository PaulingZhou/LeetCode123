public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for(int i = 0 ; i < m ; i++)nums3[i] = nums1[i];
        int count1 = 0,count2 = 0,count3 = 0;
        while(count2 < n && count3 < m){
        	if(nums2[count2] < nums3[count3]){
        		nums1[count1] = nums2[count2++];
        	}else{
        		nums1[count1] = nums3[count3++];
        	}
        	count1++;
        }
        if(count2 == n){
        		while(count1 < m+n)nums1[count1++] = nums3[count3++];
        }
        else if(count3 == m){
        	while(count1 < m+n)nums1[count1++] = nums2[count2++];
        }
    }
}
