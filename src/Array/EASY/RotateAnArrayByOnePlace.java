package Array.EASY;

public class RotateAnArrayByOnePlace {
    public static int[] rorateBy1stPlace(int[] nums, int n) {
        int first = nums[0];

        for (int i = 1; i < n; i++) {
            nums[i - 1] = nums[i];
        }

        nums[n - 1] = first;

        return nums;
    }

    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 40 };
        int n = nums.length;

        int ans[] = rorateBy1stPlace(nums, n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}