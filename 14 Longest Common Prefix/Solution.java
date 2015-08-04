public class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if(strs == null || strs.length == 0)return "";
    	int length = strs.length;
    	int maxLength = 0,temp = 0;
    	for(int i = 0;i < length;i++){
    		System.out.println("strs[" + i + "]-->" + strs[i]);
    		for(int j = 0;j < strs[i].length();j++){
    			if(strs[i].charAt(j) == '-'){
    				if(maxLength < j){
    					temp = i;
    					maxLength = j;
    				}
    				break;
    			}
    			if(maxLength == j)
   				temp = -1;
    		}
    	}
    	System.out.println(temp);
    	if(temp == -1)return "";
        return strs[temp];
    }
}