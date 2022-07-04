import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(1);
		A.add(0);
		A.add(3);
		A.add(12);
		int size = A.size();
		int zero = 0;
		int pos = 0;
		if (size == 1 && A.get(0) == 0) {
			System.out.println(A);
			return;
		}
		while (pos < size) {
			if (pos < zero)
				pos = zero + 1;
			if (A.get(zero) > 0) {
				++zero;
				continue;
			}
			if (A.get(pos) == 0) {
				++pos;
				continue;
			}
			int t = A.get(zero);
			A.set(zero, A.get(pos));
			A.set(pos, t);
		}
		System.out.println(A);
	}

}
