
public class Solution {

	public static void main(String[] args) {
		int[] A = { 756898537, -1973594324, -2038664370, -184803526, 1424268980 };
		double maxSum = -1;
		double sum = 0;
		int index = 0;
		int length = -1;
		int start = -1;
		for (int i = 0; i < A.length; ++i) {
			if (A[i] < 0) {
				sum = 0;
				index = i + 1;
				continue;
			} else
				sum = sum + A[i];
			if (sum >= maxSum) {
				maxSum = sum;
				int newLength = i - index + 1;
				if (newLength > length) {
					start = index;
					length = newLength;
				}
			} else if (sum == maxSum && length > 0) {
				int newLength = i - index + 1;
				if (newLength > length) {
					start = index;
					length = newLength;
				}
			}
		}
		if (length > 0) {
			long[] a = new long[length];
			for (int i = 0; i < a.length; ++i)
				a[i] = A[start++];
			for (int i = 0; i < a.length; ++i)
				System.out.print(a[i] + " ");
		} else
			System.out.println(-1);

	}

}
