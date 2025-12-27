// In bubble sort we check adjacent elements and swap them
// worst case:- O(n2)
// stable (order of elements are maintained)

import java.util.*;

class bubble {

    public static void main(String args[]) {
        int[] arr = { 2, 41, 48, 42, 17, 87, 1, 5, 51 };
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int nums[]) {
        boolean swapped = false;
        for (int i = 0; i < nums.length; i++) {
            swapped = false;
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }
}
