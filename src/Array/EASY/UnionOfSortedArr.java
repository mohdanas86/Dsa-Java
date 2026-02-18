import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class UnionOfSortedArr {
    // public static List<Integer> unionOfArray(int[] arr1, int[] arr2, int n, int
    // m) {
    // TreeMap<Integer, Integer> ans = new TreeMap<>();

    // for (int i = 0; i < n; i++) {
    // ans.put(arr1[i], ans.getOrDefault(arr1[i], 0) + 1);
    // }

    // for (int i = 0; i < m; i++) {
    // ans.put(arr2[i], ans.getOrDefault(arr2[i], 0) + 1);
    // }

    // List<Integer> temp = new ArrayList<>();

    // for (int val : ans.keySet()) {
    // temp.add(val);
    // }

    // return temp;
    // }

    // TC = O((m+n)log(m+n)) SC = O(1)
    public static List<Integer> unionOfArray(int[] arr1, int[] arr2, int n, int m) {

        Set<Integer> set = new TreeSet<>();

        for (int val : arr1) {
            set.add(val);
        }

        for (int val : arr2) {
            set.add(val);
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 2, 3, 4, 4, 5 };
        int n = arr1.length;
        int m = arr2.length;

        List<Integer> ans = unionOfArray(arr1, arr2, n, m);

        for (int val : ans) {
            System.out.print(val + " ");
        }
    }
}
