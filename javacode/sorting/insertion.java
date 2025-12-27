// makes array sorted from left to right. inserting every new element position in correct order.
// worst case :- O(n2)
// stable and works well more smaller datasets
import java.util.*;

public class insertion {

    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 4, 23, 14, 1, 2, 13 };
        System.out.println(Arrays.toString(arr));
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
