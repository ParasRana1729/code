import java.util.Arrays;

/**
 * Leetcode 75: Sort Colors (Dutch National Flag Algorithm)
 * https://leetcode.com/problems/sort-colors/
 *
 * Approach: Dutch National Flag Algorithm (Three Pointers)
 * - We maintain three pointers: low, mid, and high.
 * - 'low' points to the last '0'. Elements to the left of 'low' are 0s.
 * - 'high' points to the first '2'. Elements to the right of 'high' are 2s.
 * - 'mid' is the current element under consideration.
 *
 * Algorithm:
 * 1. Initialize low = 0, mid = 0, high = nums.length - 1.
 * 2. Iterate while mid <= high:
 *    a. If nums[mid] is 0:
 *       Swap nums[low] and nums[mid].
 *       Increment low and mid.
 *    b. If nums[mid] is 1:
 *       Increment mid. (1 is already in its correct relative position for now)
 *    c. If nums[mid] is 2:
 *       Swap nums[mid] and nums[high].
 *       Decrement high. (Do NOT increment mid, as the swapped element at mid might be 0 or 1 and needs to be re-evaluated).
 *
 * Time Complexity: O(N) - We traverse the array with 'mid' pointer at most once.
 * Space Complexity: O(1) - No extra space used beyond a few pointers.
 */
class SortColors {

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                // nums[mid] == 2
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
                // Note: mid is NOT incremented here because the new element at nums[mid]
                // could be 0, 1, or 2 and needs to be checked.
            }
        }
    }

    public static void main(String[] args) {
        SortColors solution = new SortColors();

        int[] nums1 = { 2, 0, 2, 1, 1, 0 };
        System.out.println("Original: " + Arrays.toString(nums1));
        solution.sortColors(nums1);
        System.out.println("Sorted:   " + Arrays.toString(nums1)); // Expected: [0, 0, 1, 1, 2, 2]

        int[] nums2 = { 2, 0, 1 };
        System.out.println("Original: " + Arrays.toString(nums2));
        solution.sortColors(nums2);
        System.out.println("Sorted:   " + Arrays.toString(nums2)); // Expected: [0, 1, 2]

        int[] nums3 = { 0 };
        System.out.println("Original: " + Arrays.toString(nums3));
        solution.sortColors(nums3);
        System.out.println("Sorted:   " + Arrays.toString(nums3)); // Expected: [0]

        int[] nums4 = { 1, 2, 0 };
        System.out.println("Original: " + Arrays.toString(nums4));
        solution.sortColors(nums4);
        System.out.println("Sorted:   " + Arrays.toString(nums4)); // Expected: [0, 1, 2]
    }
}
