
public class Solution {

	public static void main(String[] args) {
		String A = " hello world ";
		String ans = "";
		int i = 0;
		int j = 0;
		int len = A.length();
		while (i < len) {
			while (i < len && A.charAt(i) == ' ')
				++i;
			j = i;
			while (j < len && A.charAt(j) != ' ')
				++j;
			if(i>=len && j >= len)break;
			String word = A.substring(i, j);
			if (ans.length() != 0)
				ans = word + " " + ans;
			else
				ans = word;
			i = j;
		}
		System.out.println(ans);

	}

}
