package javacode.arrayc.easy;

public class longestSubarraySumKTwoPointers {

    // Function to find the length of the longest subarray with sum K
    // Note: This Optimal Approach (Two Pointers) works best for arrays with non-negative numbers (zeros and positives).
    public static int solve(int[] a, int k) {
        int n = a.length;
        int left = 0;
        int right = 0;
        long sum = a[0];
        int maxLen = 0;

        while (right < n) {
            // If current sum is greater than k, shrink the window from the left
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // If sum matches k, we found a candidate subarray
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move the right pointer forward
            right++;
            if (right < n) {
                sum += a[right];
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
