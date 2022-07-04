import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(5);
		A.add(-2);
		A.add(3);
		A.add(1);
		A.add(2);
		int B = 3;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < A.size(); ++i) {
			if (pq.size() < B)
				pq.add(A.get(i));
			else {
				pq.add(A.get(i));
				pq.poll();
			}
		}
		int sum = 0;
		while (pq.size() != 0)
			sum = sum + pq.poll();
		System.out.println(sum);

	}

}
