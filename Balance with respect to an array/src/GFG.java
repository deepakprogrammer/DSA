import java.io.BufferedReader;
import java.io.FileReader;

public class GFG {

	public static void main(String[] args)throws Exception {
		FileReader fr = new FileReader("C:\\Users\\Deepak.Sharma1\\Documents\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String[] s = br.readLine().trim().split(" ");
		int x = Integer.parseInt(br.readLine());
		int[] a = new int[s.length];
		for(int i = 0; i < s.length;++i)
			a[i] = Integer.parseInt(s[i]);
		int ceil = Integer.MIN_VALUE;
		int floor = Integer.MAX_VALUE;
		int start = 0;
		int end = a.length - 1;
		while( start <= end ) {
			int mid = start + ( end - start ) / 2;
			if( x > a[mid] ) {
				floor = mid;
				start = mid + 1;
			}else if( x < a[mid] ) {
				ceil = mid;
				end = mid - 1;
			}
		}
		System.out.println("floor : "+ floor);
		System.out.println("Ceil : "+ ceil);
	}
	

}
