public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 12, 19};
        int target = 12;
        int l = 0;
        int r = arr.length-1;
        boolean flag = false;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == target) {
                flag = true;
                break;
            }
            else if (arr[mid] < target) {
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        System.out.println(flag);
    }
}