
public class Solution {

	public static void main(String[] args) {
		int A = 943566;

		StringBuilder title = new StringBuilder();
		while (A > 0) {
			int rem = A % 26;
			int digit = 64;
			if (rem != 0)
				digit += rem;
			else {
				digit += 26;
				--A;
			}
			title.append(Character.toString((char)digit));
			A /= 26;
		}
		//return title.reverse().toString();
		System.out.println(title.reverse());

	}

}
