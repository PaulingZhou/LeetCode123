public class Test {
	public static void main(String[] args) {
		String a = "mississippi";
		String b = "issip";
		Solution solution = new Solution();
		int count = solution.strStr(a, b);
		System.out.println(count);
	}
}
