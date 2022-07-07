import java.util.ArrayList;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> ans = new ArrayList<Integer>();
		A.add(39);
		A.add(27);
		A.add(11);
		A.add(4);
		A.add(24);
		A.add(32);
		A.add(32);
		A.add(1);
		Stack<Integer> s = new Stack<Integer>();
		s.push(-1);
		for (int i : A) {
			if (s.size() > 0 && s.peek() < i) {
				ans.add(s.peek());
				s.push(i);
			} else {
				while (s.size() > 0 && s.peek() >= i)
					s.pop();
				ans.add(s.peek());
				s.push(i);
			}
		}
		System.out.println(ans);

	}

}
