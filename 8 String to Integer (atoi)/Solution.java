public class Solution {
    public int myAtoi(String str) {
    	//check if str is null
    	if(str == null || str.equals(""))
    		return 0;
    	else{
    		int idx = 0,sign = 1,total = 0;
    		//remove spaces
    		str = str.trim();
    		char[] c = str.toCharArray();
    		//handle sign
    		if(c[idx] == '-' || c[idx] == '+'){
    			sign = c[idx] == '+' ? 1 : -1;
    			idx++;
    		}
    		//convert number & avoid overflows
    		while(idx < c.length){
    			int digit = c[idx] - '0';
    			if(digit < 0 || digit > 9)break;
    			if(Integer.MAX_VALUE / 10 < total || (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit))
    				return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
    			total = total * 10 + digit;
    			idx++;
    		}
    		return total * sign;
    	}
    }
}