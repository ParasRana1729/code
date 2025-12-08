package javacode.arrayc.medium;

import java.util.HashMap;
import java.util.Arrays;

/**
 * Leetcode 1: Two Sum
 *
 * Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Approach: HashMap
 * - We iterate through the array.
 * - For each element 'num', we calculate the 'required' value to reach the target (required = target - num).
 * - We check if 'required' is already in our HashMap.
 *   - If YES: We found the pair! Return the current index and the index stored in the map.
 *   - If NO: Store the current element and its index in the map for future checks.
 *
 * Time Complexity: O(N) - We traverse the list containing N elements only once. Each look up in the table costs only O(1) time.
 * Space Complexity: O(N) - The extra space required depends on the number of items stored in the hash table, which stores at most N elements.
 */
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> data = new HashMap<>();
        for(int i = 0; i<n; i++){
            int req = target - nums[i];
            if(data.containsKey(req)){
                return new int[]{i, data.get(req)};
            }
            data.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = solution.twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result)); // Expected output: [1, 0] or [0, 1]
    }
}
