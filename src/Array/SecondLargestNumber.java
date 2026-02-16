package Array;

public class SecondLargestNumber {

    // TC = O(n), SC = O(1)
    public static int findSecondLargestNumber(int[] nums, int n) {
        if (n < 2)
            return -1;

        int large = Integer.MIN_VALUE;
        int secLarge = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (nums[i] > large) {
                secLarge = large;
                large = nums[i];
            }

            else if (nums[i] > secLarge && nums[i] != large) {
                secLarge = nums[i];
            }
        }

        return secLarge;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 7, 7, 5 };
        int n = arr.length;

        int ans = findSecondLargestNumber(arr, n);
        System.out.println(ans);
    }
}
