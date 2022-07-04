import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		Stack<Integer> st = new Stack<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		B.add(2);
		B.add(5);
		B.add(5);
		int i = A.size();
		int j = B.size();
		int a = 0;
		int b = 0;
		int sum = 0;
		while (i > 0 || j > 0) {
			if (i > 0 && j > 0) {
				a = A.get(--i);
				b = B.get(--j);
				sum = sum + a + b;
			} else if (i > 0) {
				a = A.get(--i);
				b = 0;
				sum = sum + a + b;
			} else if (j > 0) {
				a = 0;
				b = B.get(--j);
				sum = sum + a + b;
			}
			if (sum > 9) {
				st.push(sum % 10);
				sum = sum / 10;
			} else {
				st.push(sum);
				sum = 0;
			}
		}
		if (sum != 0)
			st.push(sum);
		while (st.size() != 0)
			ans.add(st.pop());
		System.out.println(ans);

	}

}
