package Array.EASY;

public class MissingNumber {
    public static int findMissingNumber(int[] nums, int n) {
        int expectedSum = n * (n + 1) / 2;
        int total = 0;

        for (int val : nums) {
            total += val;
        }

        return expectedSum - total;
    }

    public static void main(String[] args) {
        int[] nums = { 8, 2, 4, 5, 3, 7, 1 };
        int n = nums.length; // not nums.length

        int ans = findMissingNumber(nums, n + 1);
        System.out.println(ans); // prints 6
    }

}
