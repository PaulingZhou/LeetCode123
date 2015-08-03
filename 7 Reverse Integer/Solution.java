public class Solution {
    public int reverse(int x) {
    	int newResult = 0,result = 0;
    	while(x != 0){
    		newResult = result * 10 + x % 10;
    		if((newResult - x%10) != result * 10)
    			return 0;
    		result = newResult;
    		x/=10;
    	}
    	return newResult;
    }
}