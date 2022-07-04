import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(3);
		a.add(2);
		a.add(0);
		a.add(1);
		int length = a.size();
		for (int i = 0; i < length; ++i) {
			int x = a.get(i);
			int y = a.get(a.get(i)) % length;
			a.set(i, x + y * length);
		}
		for (int i = 0; i < length; ++i)
			a.set(i, a.get(i) / length);
		System.out.println(a);

	}

}
