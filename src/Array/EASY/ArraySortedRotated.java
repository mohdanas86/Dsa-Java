package Array.EASY;

/**
 * nums[(i + 1) % n]
 * 1 % 5 = 1
 * 2 % 5 = 2
 * 5 % 5 = 0
 */

public class ArraySortedRotated {
    // TC = O(n), SC = O(1)
    public static void CheckArrayIsSorted(int nums[], int n) {
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                cnt++;
            }
            if (cnt > 1) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }

    public static void main(String[] args) {
        int[] nums = { 3, 4, 5, 1, 2 };
        int n = nums.length;

        CheckArrayIsSorted(nums, n);
    }
}
