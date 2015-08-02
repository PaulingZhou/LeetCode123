public class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int length = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        //sb init
        for(int i = 0 ; i < numRows ; i++){
        	sb[i] = new StringBuffer();
        }
        int i = 0;
        while(i < length){
        	for(int idx = 0 ; idx < numRows && i < length ; idx++)
        		sb[idx].append(c[i++]);
        	for(int idx = numRows-2 ; idx >= 1 && i < length ; idx--)
        		sb[idx].append(c[i++]);
        }
        for(int idx = 1 ; idx < numRows ; idx++){
        	sb[0].append(sb[idx]);
        }
        return sb[0].toString();
    }
}