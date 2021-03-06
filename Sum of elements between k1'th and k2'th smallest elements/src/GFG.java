import java.util.Collections;
import java.util.PriorityQueue;

public class GFG {

	public static void main(String[] args) {
		long[] A = { 20, 8, 22, 4, 12, 10, 14 };
		PriorityQueue<Long> pq = new PriorityQueue<Long>(Collections.reverseOrder());
		long k1th, k2th, k1 = 3, k2 = 6;
		for (int i = 0; i < A.length; ++i) {
			if (pq.size() < k1)
				pq.add(A[i]);
			else {
				pq.add(A[i]);
				pq.poll();
			}
		}
		k1th = pq.peek();
		pq = new PriorityQueue<Long>(Collections.reverseOrder());

		for (int i = 0; i < A.length; ++i) {
			if (pq.size() < k2)
				pq.add(A[i]);
			else {
				pq.add(A[i]);
				pq.poll();
			}
		}
		k2th = pq.peek();
		long sum = 0;
		for (int i = 0; i < A.length; ++i) {
			if (A[i] > k1th && A[i] < k2th)
				sum = sum + A[i];
		}
		System.out.println(sum);

	}

}
