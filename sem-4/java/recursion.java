public class recursion {

    static int fact(int n) {
        if (n == 0) return 1;
        return n * fact(n-1);
    }

    static void printn(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printn(n-1);
    }

    public static void main(String args[]) {
        // printn(10);
        System.out.println(fact(5)); 
    }
}
