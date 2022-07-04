import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		A.add(3);
		A.add(1);
		A.add(2);
		A.add(5);
		A.add(3);
		int len = A.size();
		int x = 0;
		int y = 0;
		int xor = 0;
		int rb = 0;
		for (int i = 0; i < len; ++i)
			xor = xor ^ (i + 1) ^ A.get(i);
		rb = xor & -xor;
		for (int i : A)
			if ((i & rb) == 0)
				x = x ^ i;
			else
				y = y ^ i;
		for (int i = 1; i <= len; ++i)
			if ((i & rb) == 0)
				x ^= i;
			else
				y ^= i;
		for (int i : A)
			if (i == x) {
				ans.add(x);
				ans.add(y);
				break;
			} else if (i == y) {
				ans.add(y);
				ans.add(x);
				break;
			}
		System.out.println(ans);
	}

}
