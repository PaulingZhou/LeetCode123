import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] plusOne(int[] digits) {
    	List<Integer> list = new ArrayList<Integer>();
    	int carry = 1;
    	for(int i = digits.length-1 ; i >= 0  ; i--){
    		digits[i] += carry;
    		if(digits[i] == 10){
    			digits[i] = 0;
    			carry = 1;
    		}else carry = 0;
    		list.add(digits[i]);
    		if(i == 0 && carry == 1)list.add(1);
    	}
    	int[] result = new int[list.size()];
    	for(int i = list.size()-1 ; i >= 0 ; i--){
    		result[list.size()-1-i] = list.get(i);
    		System.out.println(list.get(i));
    	}
        return null;
    }
}
