public class recursion {

    static int fact(int n) {
        return n == 0 ? 1 : n * fact(n - 1);
    }

    static int fibo(int n) {
        return n == 0 ? 0 : n == 1 ? 1 : fibo(n-1) + fibo(n-2); 
    }

    public static void main(String args[]) {
        System.out.println(fact(5));
        System.out.println(fibo(10));
    }
}
