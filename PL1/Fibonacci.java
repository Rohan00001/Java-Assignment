public class Fibonacci {
    public static void main(String[] args) {
        int N = 10; // Change N to the desired number of Fibonacci numbers
        int a = 0, b = 1;

        System.out.println("Fibonacci Series of " + N + " numbers:");
        for (int i = 0; i < N; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
