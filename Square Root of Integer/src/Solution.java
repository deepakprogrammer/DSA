
public class Solution {

	public static void main(String[] args) {
		int x = 16;
		int mid = 0;
		int start = 0;
		int end = x;
		while (start <= end) {
			mid = start + (end - start) / 2;
			int result = mid * mid;
			if (result == x) {
				System.out.println(mid);
				return;
			} else if (result < x)
				start = mid + 1;
			else
				end = mid - 1;
		}
		System.out.println(end);

	}

}
