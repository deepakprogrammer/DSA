import java.util.ArrayList;
import java.util.HashMap;

public class GFG {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int s = 15;
		ArrayList<Integer> ans = new ArrayList<Integer>();
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		int sum = 0;
		m.put(0,-1);
		for (int i = 0; i < arr.length; ++i) {
			sum = sum + arr[i];
			if (m.containsKey(sum - s)) {
				ans.add(m.get(sum - s) + 2);
				ans.add(i + 1);
				break;
			} else
				m.put(sum, i);
		}
		System.out.println(ans);
	}

}
