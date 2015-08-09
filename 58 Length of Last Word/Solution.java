public class Solution {
    public int lengthOfLastWord(String s) {
    	int length = s.length();
    	int count = 0,temp = 0;
    	for(int i = 0 ; i < length ; i++){
    		char c = s.charAt(i);
    		if(c == ' '){
    			temp = count == 0 ? temp : count;
    			count = 0;
    		}else
    		count++;
    	}
    	count = count == 0 ? temp : count;
    	System.out.println(count);
        return count;
    }
}
