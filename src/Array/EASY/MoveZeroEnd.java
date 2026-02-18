import java.util.Vector;

public class MoveZeroEnd {
    public static int[] MoveZeros(int[] nums, int n) {
        Vector<Integer> temp = new Vector<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp.add(nums[i]);
            }
        }

        for (int i = 0; i < temp.size(); i++) {
            nums[i] = temp.get(i);
        }

        for (int i = temp.size(); i < n; i++) {
            nums[i] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 0, 2, 3, 0, 4, 0, 1 };
        int[] nums = { 1, 2, 0, 1, 0, 4, 0 };
        int n = nums.length;

        int[] ans = MoveZeros(nums, n);

        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
