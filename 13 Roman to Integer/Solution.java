import java.util.*;

public class Solution {
    public int romanToInt(String s) {
        if(s == null || s.equals(""))return 0;
        else{
        	int length = s.length();
        	HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        	map.put('I',1);
        	map.put('V',5);
        	map.put('X',10);
        	map.put('L',50);
        	map.put('C',100);
        	map.put('D',500);
        	map.put('M',1000);
        	int result = map.get(s.charAt(length - 1));
        	int temp = result;
        	for(int i = length-2 ; i >= 0 ; i--){
        		int current = map.get(s.charAt(i));
        		result = temp <= current ? result+current : result-current;
        		temp = current;
        	}
        	return result;
        }
    }
}