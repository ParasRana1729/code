package javacode.arrayc.easy;

/**
 * Leetcode 1752: Check if Array Is Sorted and Rotated
 *
 * Problem: Check if the array was originally sorted non-decreasingly and then rotated.
 *
 * Approach: Simulated Circular Array (Sliding Window)
 * Instead of physically rotating, we check if there exists a contiguous segment of length 'size'
 * that is sorted. We simulate the circular nature by iterating up to 2*size and using modulo.
 */
public class checkIfArrayIsSorted {
    public boolean check(int[] nums) {
        int size = nums.length;
        if(size==1){
            return true;
        }
        int count = 1;
        
        // Iterate up to size*2 to cover the boundary where the array wraps around.
        // Essentially treats the array as [nums, nums].
        for(int i = 1; i < size*2; i++){
            // Compare current element with previous, handling the wrap-around using modulo
            if(nums[(i)%size]>=nums[(i-1)%size]){
                count++;
            }
            else{
                // Sequence broken, reset counter
                count = 1;
            }
            // If we found a sorted sequence of the full array length, return true
            if(count == size){
                return true;
            }
        }
        return false;
    }
}
