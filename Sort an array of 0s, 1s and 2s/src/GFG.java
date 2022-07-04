import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GFG {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\Deepak.Sharma1\\Documents\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		String[] inputLine = br.readLine().trim().split(" ");
		int[] arr = new int[inputLine.length];
		for (int i = 0; i < inputLine.length; ++i)
			arr[i] = Integer.parseInt(inputLine[i]);

		fr.close();
		br.close();
		sort012(arr);
		for (int i : arr)
			System.out.print(i + " ");
	}

	public static void sort012(int a[]) {
		int l = 0, m = 0, t = 0, h = a.length - 1;

		while (m <= h) {
			if (a[l] == 0) {
				++l;
				continue;
			}
			if (a[m] == 1) {
				++m;
				continue;
			}
			if (a[h] == 2) {
				--h;
				continue;
			}
			if (m < l) {
				m = l;
				continue;
			}
			if (a[m] == 0) {
				t = a[l];
				a[l] = a[m];
				++l;
				a[m] = t;
			}
			if (a[m] == 2) {
				t = a[h];
				a[h] = a[m];
				--h;
				a[m] = t;
			}
		}
	}
}
