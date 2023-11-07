public class Fibonacci_Series {
    static int num1 = 0, num2 = 1, sum2 = 0;

    static void Fibonacci_R(int n) {
        if (n > 0) {
            sum2 = num1 + num2;
            System.out.print(sum2 + " ");
            num1 = num2;
            num2 = sum2;
            Fibonacci_R(n - 1);
        }
    }

    static void fibonnaci_I(int n) {
        int n1 = 0, n2 = 1;
        System.out.print(n1 + " " + n2 + " ");

        for (int i = 2; i < n; i++) {
            int sum = n1 + n2;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
        }
    }

    public static void main(String[] args) {
        int n = 15;
        // fibonnaci_I(n);
        // System.out.println();
        // System.out.print(0 + " " + 1 + " ");
        // Fibonacci_R(n - 2);
        // Calculate time taken for the iterative approach
        long startTimeIterative = System.nanoTime();
        fibonnaci_I(n);
        long endTimeIterative = System.nanoTime();
        long timeIterative = endTimeIterative - startTimeIterative;
        System.out.println("Time taken by iterative approach: " + timeIterative + " nanoseconds");

        // Calculate time taken for the recursive approach
        long startTimeRecursive = System.nanoTime();
        System.out.print(0 + " " + 1 + " ");
        Fibonacci_R(n - 2);
        long endTimeRecursive = System.nanoTime();
        long timeRecursive = endTimeRecursive - startTimeRecursive;
        System.out.println("Time taken by recursive approach: " + timeRecursive + " nanoseconds");

    }

}