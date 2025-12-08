package javacode.arrayc.easy;

/**
 * Leetcode 26: Remove Duplicates from Sorted Array
 *
 * Problem: Remove duplicates in-place from a sorted array so each unique element appears once.
 * Returns the number of unique elements.
 *
 * Approach: Two Pointers
 * - i (Slow Pointer): Points to the last confirmed unique element.
 * - j (Fast Pointer): Scans the array for new unique elements.
 */
class Solution {
    public int removeDuplicates(int[] nums) {
       int i = 0; // Tracks index of the last placed unique element
       int j = 0; // Scans through the array
       
       while(j<nums.length){
        // If we find a new element different from the last unique one...
        if(nums[i]!=nums[j]){
            // Increment 'i' to the next position and store the new unique value there.
            // We use pre-increment (++i) to ensure we don't overwrite the current unique value at 'i'.
            nums[++i] = nums[j];    
        }
        j++;
       }
       // Return count (index + 1)
       return i+1;
    }
}