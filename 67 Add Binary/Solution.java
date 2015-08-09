public class Solution {
	public String addBinary(String a, String b) {
		int aLen = a.length() - 1, bLen = b.length() - 1;
		int carry = 0, count = 0;
		String result = "";
		while (aLen >= 0 || bLen >= 0) {
			int ac = aLen >= 0 ? Integer.parseInt("" + a.charAt(aLen)) : 0;
			int bc = bLen >= 0 ? Integer.parseInt("" + b.charAt(bLen)) : 0;
			count = carry + ac+ bc;
			if(count > 1){
				carry = 1;
				count -= 2;
			}else carry = 0;
			result = count + result;
			aLen--;bLen--;
		}
		if(carry == 1)result = 1 + result;
		System.out.println("result-->" + result);
		return result;
	}
}
