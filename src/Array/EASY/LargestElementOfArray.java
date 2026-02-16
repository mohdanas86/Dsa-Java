package Array.EASY;

import java.util.Arrays;
import java.util.Vector;

public class LargestElementOfArray {

    // TC = O(n2), SC = O(1)
    // public static void LargestElement(Vector<Integer> nums, int n) {
    // int maxi = 0;

    // for (int i = 0; i < n; i++) { // O(n2)
    // for (int j = 0; j < n; j++) {
    // if (nums.get(i) < nums.get(j)) {
    // maxi = Math.max(nums.get(j), maxi);
    // }
    // }
    // }

    // System.out.println(maxi);
    // }

    // TC = O(n), SC = O(1)
    public static void LargestElement(Vector<Integer> nums, int n) {
        int maxi = nums.get(0);

        for (int i = 1; i < n; i++) {
            if (nums.get(i) > maxi) {
                maxi = nums.get(i);
            }
        }

        System.out.println(maxi);
    }

    public static void main(String args[]) {
        Vector<Integer> nums = new Vector<>(Arrays.asList(0, 2, 3, 5, 4, 1, 7));
        int n = nums.size();

        LargestElement(nums, n);
    }
}
