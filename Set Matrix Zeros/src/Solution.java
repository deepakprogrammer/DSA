import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

		ArrayList<Integer> ab = new ArrayList<Integer>();
		ArrayList<Integer> ac = new ArrayList<Integer>();
		ArrayList<Integer> ad = new ArrayList<Integer>();

		ab.add(0);
		ab.add(1);
		ab.add(2);
		ab.add(0);

		ac.add(3);
		ac.add(4);
		ac.add(5);
		ac.add(2);

		ad.add(1);
		ad.add(3);
		ad.add(1);
		ad.add(5);

		a.add(ab);
		a.add(ac);
		a.add(ad);

		int row = a.size();
		int col = a.get(0).size();

		boolean rowCon = false, columnCon = false;

		// check first column has zero or not
		for (int i = 0; i < row; ++i) {
			if (a.get(i).get(0) == 0) {
				columnCon = true;
				break;
			}
		}
		// check column has zero or not
		for (int j = 0; j < col; ++j) {
			if (a.get(0).get(j) == 0) {
				rowCon = true;
				break;
			}
		}
		// set zero for rows ans columns
		for (int i = 1; i < row; ++i) {
			for (int j = 1; j < col; ++j)
				if (a.get(i).get(j) == 0) {
					a.get(0).set(j, 0);// set zero for columns 00 01 02
					a.get(i).set(0, 0);// set zero for rows 00 01 02
				}
		}
		for (int i = 1; i < row; ++i)
			for (int j = 1; j < col; ++j)
				if (a.get(0).get(j) == 0 || a.get(i).get(0) == 0)
					a.get(i).set(j, 0);

		if (rowCon) {
			for (int i = 0; i < col; ++i)
				a.get(0).set(i, 0);
		}
		if (columnCon) {
			for (int j = 0; j < row; ++j)
				a.get(j).set(0, 0);
		}

		for (int i = 0; i < row; ++i) {
			for (int j = 0; j < col; ++j)
				System.out.print(a.get(i).get(j) + " ");
			System.out.println();
		}

	}

}
