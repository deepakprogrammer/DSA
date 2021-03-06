
public class Solution {
	public static void swap(StringBuilder copyString, int i, int j) {
		char t = copyString.charAt(i);
		copyString.setCharAt(i, copyString.charAt(j));
		copyString.setCharAt(j, t);
	}

	public static void reverse(StringBuilder copyString, int i, int j) {
		while (i < j)
			swap(copyString, i++, j--);
	}

	public static void main(String[] args) {
		String A = "218765";
		/*
		 * if (A == null || A.length() == 0) return "-1";
		 */
		String ans = "";
		StringBuilder copyString = new StringBuilder(A);
		int length = A.length();
		int i = length - 2;
		while (i >= 0 && copyString.charAt(i) >= copyString.charAt(i + 1))
			--i;
		if (i >= 0) {
			int j = length - 1;
			while (j >= 0 && copyString.charAt(j) <= copyString.charAt(i))
				--j;
			swap(copyString, i, j);
			reverse(copyString, i + 1, length - 1);
			ans = copyString.toString();

		} else {
			ans = "-1";
		}
		System.out.println(ans);
	}

}
