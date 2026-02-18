public class LinearSearch {
    public static int linearSearch(int[] nums, int n, int target) {

        // for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (nums[j] == target) {
                return j;
            }
        }
        // }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        int n = nums.length;
        int target = 2;

        int ans = linearSearch(nums, n, target);

        System.out.println(ans);
    }
}
