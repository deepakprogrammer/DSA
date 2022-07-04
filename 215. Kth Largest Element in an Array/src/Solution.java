import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		ArrayList<Integer> al = new ArrayList<Integer>();
		int[] nums = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		for (int i = 0; i < nums.length; ++i) {
			if (pq.size() < k)
				pq.add(nums[i]);
			else {
				if (pq.peek() < nums[i]) {
					al.add(pq.poll());
					pq.add(nums[i]);
				}

			}
		}
		System.out.println(pq);

	}

}
