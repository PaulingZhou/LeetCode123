public class Solution {
    public int strStr(String haystack, String needle) {
    	if(needle.length() == 0)return 0;
    	int pointer = -1;
    	for(int i = 0 ; i < haystack.length() ; i++){
    		if(haystack.charAt(i) == needle.charAt(++pointer));
    		else {
    			i = i-pointer;
    			pointer = -1;
    		}
    		if(pointer+1 == needle.length())return i-pointer;
    	}
        return -1;
    }
}
