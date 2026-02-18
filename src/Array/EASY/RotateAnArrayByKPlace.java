package Array.EASY;

import java.util.Vector;

public class RotateAnArrayByKPlace {
    public static int[] rorateByKthPlace(int[] nums, int n, int k) {
        Vector<Integer> temp = new Vector<>();

        for (int i = 0; i < k; i++) {
            temp.add(nums[i]);
        }

        for (int i = k; i < n; i++) {
            nums[i - k] = nums[i];
        }

        for (int i = n - k; i < n; i++) {
            nums[i] = temp.get(i - (n - k));
        }

        return nums;
    }

    // public static void reverse(int[] nums, int st, int end) {
    // while (st < end) {
    // int temp = nums[st];
    // nums[st] = nums[end];
    // nums[end] = temp;
    // st++;
    // end--;
    // }
    // }

    // public static int[] rorateByKthPlace(int[] nums, int n, int k) {
    // reverse(nums, 0, n - k - 1);
    // reverse(nums, n - k, n - 1);
    // reverse(nums, 0, n - 1);

    // return nums;
    // }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int k = 3;
        int n = nums.length;

        int ans[] = rorateByKthPlace(nums, n, k);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
