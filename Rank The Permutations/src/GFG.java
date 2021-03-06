import java.util.HashMap;
import java.util.Map;

public class GFG {

	public static void main(String[] args) {
		String A = "asasdsdsadasdadsadasdsa";
		final int mod = 1000003;
		int rank = 0;
		int length = A.length();
		int[] facts = new int[length];
		facts[0] = 1;

		for (int i = 1; i < length; ++i)
			facts[i] = ((facts[i - 1] % mod) * (i % mod) % mod);

		for (int i = 0; i < length; ++i) {
			int count = 0;
			char ci = A.charAt(i);
			for (int j = i + 1; j < length; ++j) {
				char cj = A.charAt(j);
				if (cj < ci)
					++count;
			}

			Map<Character, Integer> m = new HashMap<Character, Integer>();
			int repPro = 1;
			for (int k = i; k < length; ++k) {
				char ck = A.charAt(k);
				if (m.containsKey(ck)) {
					m.put(ck, m.get(ck) + 1);
					repPro = ((repPro % mod) * (m.get(ck) % mod)) % mod;
				} else
					m.put(ck, 1);
			}
			if (count != 0)
				rank = (rank + ((count % mod) * (facts[length - i - 1] % mod)) / repPro) % mod;

		}
		System.out.println(((rank % mod) + (1 % mod)) % mod);
	}

}
