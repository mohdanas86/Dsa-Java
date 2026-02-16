package Array.EASY;

public class RemoveDuplicate {
    // TC = O(n), SC = O(1)
    public static void removeDuplicatesFromArray(int[] nums, int n) {
        if (n == 0)
            return;

        int cnt = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[cnt] = nums[i];
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static void main(String[] args) {
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int n = nums.length;

        removeDuplicatesFromArray(nums, n);
    }
}
