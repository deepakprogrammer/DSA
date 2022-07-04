import java.util.ArrayList;
import java.util.List;

public class GFG {

	public static void main(String[] args) {
		int[] arr = { 17, 27, 11, 23, 14, 29, 17, 24, 3, 6, 18, 8, 18, 16, 29, 11, 24, 5, 0, 1, 28, 3, 28, 4, 13, 7, 7,
				27, 10, 21 };
		List<Integer> ans = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; ++i) {
			int index = Math.abs(arr[i]);
			int value = arr[index];
			if (value < 0)
				ans.add(Math.abs(arr[i]));
			else
				arr[index] = -arr[index];
		}
		System.out.println(ans);

	}

}
