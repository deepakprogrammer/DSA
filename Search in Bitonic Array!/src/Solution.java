import java.util.ArrayList;

public class Solution {

	public static int findbp(ArrayList<Integer> A, int start, int end) {
		while (start < end) {
			int mid = start + (end - start) / 2;
			int x = A.get(mid);
			int y = A.get(mid + 1);
			if (x < y)
				start = mid + 1;
			else if (x > y)
				end = mid;
		}
		return start;
	}

	public static int findInCreaseArea(ArrayList<Integer> A, int start, int end, int B) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (A.get(mid) == B)
				return mid;
			else if (B > A.get(mid))
				start = mid + 1;
			else
				end = mid - 1;
		}
		return -1;
	}

	public static int findInDecreaseArea(ArrayList<Integer> A, int start, int end, int B) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (A.get(mid) == B)
				return mid;
			else if (B > A.get(mid))
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(20);
		A.add(50);
		A.add(40);
		A.add(10);
		/*
		 * A.add(5); A.add(1);
		 */
		int len = A.size();
		int bp = findbp(A, 0, len - 1);
		int B = 5;
		int x = A.get(bp);
		if (x == B) {
			System.out.println(bp);
			return;
		} else if (x < B) {
			System.out.println(-1);
			return;
		} else {
			int check = findInCreaseArea(A, 0, bp, B);
			if (check != -1)
				System.out.println(check);
			else {
				check = findInDecreaseArea(A, bp, A.size() - 1, B);
				if (check != -1)
					System.out.println(check);
				else
					System.out.println(-1);
			}
		}

	}

}
