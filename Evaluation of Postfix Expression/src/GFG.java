import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class GFG {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Deepak.Sharma1\\Documents\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String s = br.readLine();
		int n = s.length();
		Stack<Integer> st = new Stack<Integer>();
		int a,b;
		for(int i = 0; i < n; ++i) {
			String c = s.charAt(i)+"";
            switch(c){
                case "*":
                	a = st.pop();
                	b = st.pop();
                    st.push( a * b );
                    break;
                case "/":
                	a = st.pop();
                	b = st.pop();
                    st.push( b / a );
                    break;
                case "+":
                	a = st.pop();
                	b = st.pop();
                    st.push( a + b );
                    break;
                case "-":
                	a = st.pop();
                	b = st.pop();
                	int res = b - a;
                    st.push( res );
                    break;
                default:
                st.push(Integer.parseInt(c));
            }
		}
		System.out.println(st.peek());
	}

}
