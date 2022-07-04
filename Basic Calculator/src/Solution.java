import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StringBufferInputStream;
import java.util.Stack;

public class Solution {

	public static int operation(int b, int a, char c) {
		switch (c) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		}
		return 0;
	}

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Deepak.Sharma1\\Documents\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		Stack<Integer> stInt = new Stack<Integer>();
		Stack<Character> stChar = new Stack<Character>();
		int length = s.length();
		int index = 0;
		int ans = 0;
		while (index < length) {
			char c = s.charAt(index);

			if (Character.isDigit(c)) {
				int num = 0;

				while (index < length && Character.isDigit(c)) {
					num = num * 10 + c - '0';
					++index;
					try {
						c = s.charAt(index);
					} catch (Exception e) {
						break;
					}
				}
				stInt.push(num);
				if (stChar.size() != 0 && stChar.peek() != '(') {
					if (stChar.peek() == '-' && stInt.size() == 1) {
						ans = stInt.pop() * -1;
					} else {
						ans = operation(stInt.pop(), stInt.pop(), stChar.pop());
					}
					stInt.push(ans);
				}

			} else {

				switch (c) {
				case '+':
					stChar.push(c);
					break;
				case '-':
					stChar.push(c);
					break;
				case '(':
					stChar.push(c);
					break;
				case ')':
					if (stChar.size() != 0 && stChar.peek() == '(') {
						stChar.pop();
						if (stChar.size() != 0 && stInt.size() != 1) {
							ans = operation(stInt.pop(), stInt.pop(), stChar.pop());
							stInt.push(ans);
						} else {
							if (stChar.size() != 0 && stChar.pop() == '-')
								stInt.push(-1 * stInt.pop());
						}
					} else {
						if (stChar.size() != 0) {
							ans = operation(stInt.pop(), stInt.pop(), stChar.pop());
							stInt.push(ans);

						} else
							break;
					}
				}

				++index;
			}

		}
		if (stInt.size() == 2) {
			int b = stInt.pop();
			int a = stInt.pop();
			System.out.println(a + b);
			return;
		}
		System.out.println(stInt.pop());

	}

}
