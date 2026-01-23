import java.util.Arrays;

public class arr {

    static void printn(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printn(n-1);
    }

    static void reverse(int[] list, int l, int r) {
        if (l >= r) {
            return;
        }
        int temp = list[l];
        list[l] = list[r];
        list[r] = temp;
        reverse(list, l + 1, r - 1);
    }

    public static void main(String args[]) {
        // int[] list = { 1, 2, 3, 4, 5 };
        // reverse(list, 0, 4);
        // System.out.println(Arrays.toString(list));
        printn(10);
    }
}
