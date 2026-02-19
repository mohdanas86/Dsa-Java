package Array.EASY;

public class MaximumConsecutive {
    // TC = O(n2), SC = O(1)
    // public static int findMaxConsecutive(int[] nums, int n) {
    // int cnt = 1;
    // int currentCnt = 1;

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < n; j++) {
    // if (nums[i] == nums[j]) {
    // currentCnt++;
    // } else {
    // cnt = Math.max(cnt, currentCnt);
    // currentCnt = 0;
    // break;
    // }
    // }
    // }

    // return cnt;
    // }

    // TC = O(n), SC = O(1)
    public static int findMaxConsecutive(int[] nums, int n) {
        int maxi = 0;
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                cnt++;
            } else {
                cnt = 0;
            }

            maxi = Math.max(maxi, cnt);
        }

        return maxi;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 1, 0, 1, 1, 1 };
        // int[] nums = { 1, 0, 1, 1, 0, 1 };
        int n = nums.length;

        int ans = findMaxConsecutive(nums, n);
        System.out.println(ans);
    }
}
