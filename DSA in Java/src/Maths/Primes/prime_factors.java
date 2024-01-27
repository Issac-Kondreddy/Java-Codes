package Maths.Primes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class prime_factors {
    public static void main(String[] args) {
        int passedTests = 0;
        int totalTests = 6;

        // Test cases
        if (testEqual(Pf(49), Arrays.asList(7, 7))) passedTests++;
        if (testEqual(Pf(60), Arrays.asList(2, 2, 3, 5))) passedTests++;
        if (testEqual(Pf(13), Arrays.asList(13))) passedTests++; // Prime number
        if (testEqual(Pf(1), new ArrayList<>())) passedTests++;  // Edge case: 1
        if (testEqual(Pf(0), new ArrayList<>())) passedTests++;  // Edge case: 0
        if (testEqual(Pf(-5), new ArrayList<>())) passedTests++; // Edge case: Negative number

        // Display test results
        System.out.println(passedTests + " out of " + totalTests + " tests passed.");

        int failedTests = totalTests - passedTests;
        if (failedTests > 0) {
            System.out.println(failedTests + " tests failed.");
        }
    }

    static ArrayList<Integer> Pf(int n) {
        if (n <= 3 && n >= 1) {
            System.out.println(n);
        }
        ArrayList<Integer> Primefactors = new ArrayList<>();
        int i = 2;
        while (n > 3) {
            if (n % i == 0) {
                Primefactors.add(i);
                n = n / i;
            } else {
                i++;
            }
        }
        return Primefactors;
    }

    static boolean testEqual(List<Integer> actual, List<Integer> expected) {
        return actual.equals(expected);
    }
}
