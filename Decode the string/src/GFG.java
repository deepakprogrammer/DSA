import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Stack;

public class GFG {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Deepak.Sharma1\\Documents\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		int length = s.length();
		Stack<Integer> stInt = new Stack<Integer>();
		Stack<String> stString = new Stack<String>();
		int index = 0;
		String currentString = "";
		while (index < length) {
			char c = s.charAt(index);
			if (Character.isDigit(c)) {
				int num = 0;
				while (Character.isDigit(c)) {
					num = num *10 + c - '0';
					++index;
					c = s.charAt(index);
				}
				stInt.push(num);
			} else if (c == '[') {
				stString.push(currentString);
				currentString = "";
				++index;
			}else if(c ==']') {
				StringBuilder sb = new StringBuilder(currentString);
				int count = stInt.pop();
				for(int i = 1; i < count; ++i)
					sb.append(currentString);
				currentString = stString.pop() + sb.toString();
				++index;
			}else {
				currentString += c;
				++index;
			}
		}
		System.out.println(currentString);

	}

}
