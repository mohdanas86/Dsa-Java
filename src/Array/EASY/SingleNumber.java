package Array.EASY;

import java.util.*;

public class SingleNumber {
    // TC = O(n2), SC = O(1)
    // public static int findSingleNumber(int[] nums, int n) {
    // for (int i = 0; i < n; i++) {
    // int cnt = 0;

    // for (int j = 0; j < n; j++) {
    // if (nums[i] == nums[j]) {
    // cnt++;
    // }
    // }
    // if (cnt == 1)
    // return nums[i];
    // }
    // return -1;
    // }

    // TC = O(n2), SC = O(n)
    public static int findSingleNumber(int[] nums, int n) {
        Map<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hash.put(nums[i], hash.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hash.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 1, 2, 1, 2 };
        // int[] nums = { 2, 2, 1 };
        int n = nums.length;

        int ans = findSingleNumber(nums, n);
        System.out.println(ans);
    }
}
