import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		List<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(10);
		A.add(5);
		final int len = A.size();
		if (A == null || len < 2) {
			return;
		}
		int min = A.get(0);
		int max = A.get(0);

		for (int i = 1; i < len; i++) {
			int x = A.get(i);
			min = Math.min(min, x);
			max = Math.max(max, x);
		}

		double gap = (double) len / (max - min);

		if (gap == 0) {
			System.out.println(max - min);
		}

		// System.out.println("gap is: " + gap);

		ArrayList<Integer> minList = new ArrayList<Integer>();
		ArrayList<Integer> maxList = new ArrayList<Integer>();
		for (int i = 0; i < A.size() + 1; i++) {
			minList.add(-1);
			maxList.add(-1);
		}

		for (int i = 0; i < A.size(); i++) {
			int curr = A.get(i);
			int index = (int) ((curr - min) * gap);

			// System.out.println("index is: " + index);
			if (minList.get(index) == -1) {
				minList.set(index, curr);
			}

			else {
				minList.set(index, Math.min(curr, minList.get(index)));
			}
			maxList.set(index, Math.max(maxList.get(index), curr));
		}

		int result = 0;

		int start = 0;

		/*
		 * for (int i = 0; i < A.size()+ 1; i++) { System.out.println("max: " +
		 * maxList.get(i)); System.out.println("min: " + minList.get(i)); }
		 */
		while (start < A.size() + 1) {

			if (minList.get(start) == -1 && maxList.get(start) == -1) {
				start++;
			}

			else {
				int currDiff = maxList.get(start) - minList.get(start);
				result = Math.max(result, currDiff);

				int j = start + 1;
				int t_max = maxList.get(start);

				while (j < A.size() + 1 && minList.get(j) == -1) {
					j++;
				}

				if (j < A.size() + 1) {
					int n_diff = minList.get(j) - t_max;
					result = Math.max(result, n_diff);
				}

				start = j;
			}
		}

		System.out.println("result is: " + result);
		// return result;

	}

}
