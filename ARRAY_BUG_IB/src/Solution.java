import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		int[][] a = { { 1, 2 }, { 3, 4, }, { 5, 6 } };
		int[] b = new int[a.length * a[0].length];
		int tn = a.length * a[0].length;
		int minCol = 0;
		int minRow = 0;
		int maxCol = a[0].length - 1;
		int maxRow = a.length - 1;
		int count = 0;
		while (count < tn) {
			for (int i = minRow, j = minCol; j <= maxCol && count < tn; ++j)
				b[count++] = a[i][j];
			++minRow;
			for (int i = minRow, j = maxCol; i <= maxRow && count < tn; ++i)
				b[count++] = a[i][j];
			--maxCol;
			for (int i = maxRow, j = maxCol; j >= minCol && count < tn; --j)
				b[count++] = a[i][j];
			--maxRow;
			for (int i = maxRow, j = minCol; i >= minRow && count < tn; --i)
				b[count++] = a[i][j];
			++minCol;

		}
		for (int i = 0; i < b.length; ++i)
			System.out.print(b[i] + " ");
	}
}
