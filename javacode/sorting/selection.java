// In selection sort we find the min element for i to n-1 th index and place it at i
// O(n^2) avg, best, worst tc

import java.util.Arrays;

class selection {

    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) min = j;
            }
            if (min != i) {
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 4, 23, 14, 1, 2, 13 };
        System.out.println(Arrays.toString(arr));
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
