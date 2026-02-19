package Array.EASY;

public class LongestSubArraySumOfK {
    public static int longestSubArray(int[] nums, int n, int target) {
        int maxi = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                int cnt = 0;

                for (int k = i; k < j; k++) {
                    sum += nums[k];
                    cnt++;
                }
                if (sum == target)
                    maxi = Math.max(maxi, cnt);
            }
        }

        return maxi;
    }

    public static void main(String[] args) {
        // int[] nums = { 10, 5, 2, 7, 1, 9 };
        int[] nums = { -3, 2, 1 };
        // int k = 15;
        int k = 6;
        int n = nums.length;

        int ans = longestSubArray(nums, n, k);

        System.out.println(ans);
    }
}
