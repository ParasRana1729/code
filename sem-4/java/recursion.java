public class recursion {
    static void printn(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printn(n-1);
    }

    public static void main(String args[]) {
        printn(10);
    }
}
