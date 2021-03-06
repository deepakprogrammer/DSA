
public class Solution {

	public static void swap(int[] nums, int i, int j) {
		int t = nums[i];
		nums[i] = nums[j];
		nums[j] = t;
	}

	public static void reverse(int[] nums, int i, int j) {
		while (i < j)
			swap(nums, i++, j--);
	}

	public static void main(String[] args) {
		int nums[] = { 1, 3, 2 };
		int i = nums.length - 2;
		while (i >= 0 && nums[i] >= nums[i + 1])
			--i;
		if (i >= 0) {
			int j = nums.length - 1;
			while (j >= 0 && nums[i] >= nums[j])
				--j;
			swap(nums, i, j);
			reverse(nums, i + 1, nums.length - 1);
		} else {
			reverse(nums, 0, nums.length - 1);
		}
		for (int k : nums)
			System.out.print(k + " ");

	}

}
