import java.util.HashMap;
import java.util.Scanner;

// int arr can be of 1e6 size locally and 1e7 globally
// for char hashing (lowercase) just do hash[charArr[i]-'a'] of size 26 or just use 256 if all characters are present
public class hash {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int[] hash = new int[10000];
        for (int i = 0; i < 5; i++) {
            hash[arr[i]]++;
        }
        System.out.println("which number freq you want to check?");
        int check = sc.nextInt();
        System.out.println(check + " appeared " + hash[check] + " times");
        sc.close();
    }
}

class Solution {

    public int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max = -1;
        for (int i : nums) {
            int value = freq.getOrDefault(i, 0) + 1;
            freq.put(i, value);
            if (value > max) {
                max = i;
            }
        }
        return max;
    }
}
