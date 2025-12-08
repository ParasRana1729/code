package javacode.arrayc.easy;
import java.util.HashMap;
import java.util.Map;

public class longestSubarraySumKHashing {

    // Function to find the length of the longest subarray with sum K using Hashing
    public static int solve(int[] a, int k) {
        int n = a.length;
        Map<Long, Integer> preSumMap = new HashMap<>();
        long sum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            sum += a[i];

            // Case 1: The subarray starts from index 0
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: The subarray starts somewhere in the middle
            // If (sum - k) exists in the map, it means the sum of the subarray 
            // from map.get(sum - k) + 1 to i is k.
            long rem = sum - k;
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            // Case 3: Store the current sum in the map
            // Only store if it doesn't already exist. We want the leftmost index 
            // for a given sum to maximize the subarray length.
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        int len = solve(a, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
