package Array.EASY;

public class ArrayIsSortedOrNot {
    // TC = O(n), SC = O(1)
    public static void CheckArrayIsSorted(int nums[], int n) {
        boolean ans = true;

        for (int i = 1; i < n; i++) {
            if (nums[i - 1] < nums[i]) {
                ans = true;
            } else {
                ans = false;
            }
        }

        if (ans == true) {
            System.out.println("sorted");
        } else {
            System.out.println("Unsorted");
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 5, 6, 7, 2, 1 };
        int n = nums.length;

        CheckArrayIsSorted(nums, n);
    }
}
