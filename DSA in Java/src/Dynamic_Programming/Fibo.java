package Dynamic_Programming;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Fibonacci sequence number: ");
        int n = scanner.nextInt();
        int[] memo = new int[n+1];

        // Timing the recursive Fibonacci without DP
        long startTime1 = System.nanoTime();
        int fiboResult = fibo(n);
        long endTime1 = System.nanoTime();
        long duration1 = (endTime1 - startTime1) / 1000000; // Convert to milliseconds

        System.out.println("Fibonacci without DP: " + fiboResult);
        System.out.println("Time taken without DP: " + duration1 + " ms");

        // Timing the recursive Fibonacci with memoization
        long startTime2 = System.nanoTime();
        int fiboMemoResult = FiboMemo(n, memo);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2) / 1000000; // Convert to milliseconds

        System.out.println("Fibonacci using Memoization in DP: " + fiboMemoResult);
        System.out.println("Time taken with DP (Memoization): " + duration2 + " ms");

        // Output the time difference
        System.out.println("Difference in time: " + (duration1 - duration2) + " ms (without DP - with DP)");
    }

    public static int FiboMemo(int n, int[] memo) {
        if (n == 0 || n == 1) {
            return n;
        }
        if (memo[n] == 0) {
            memo[n] = FiboMemo(n - 1, memo) + FiboMemo(n - 2, memo);
        }
        return memo[n];
    }

    public static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
