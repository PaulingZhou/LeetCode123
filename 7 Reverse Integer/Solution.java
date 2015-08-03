public class Solution {
    public int reverse(int x) {
    	while(x % 10 == 0){
    		x /= 10;
    	}
    	boolean isPositive = true;
        if(x < 0){
        	x = -x;
        	isPositive = false;
        }
        String s = x+"";
        int sLength = s.length();
        char c[] = s.toCharArray();
        for(int i = 0;i < sLength/2; i++){
        	char temp = c[i];
        	c[i] = c[sLength - i - 1];
        	c[sLength - i - 1] = temp;
        }
        s = new String(c);
        x = Integer.parseInt(s);
        if(x < 0)
        	return 0;
        else if(!isPositive)
        	x = -x;
        return x;
    }
}