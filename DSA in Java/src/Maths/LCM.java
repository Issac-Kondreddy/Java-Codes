package Maths;

public class LCM {
    public static void main(String[] args) {
        int passedTests = 0;
        int totalTests = 5;

        // Test cases
        if (LM(21, 6) == 42) passedTests++;
        if (LM(4, 5) == 20) passedTests++;
        if (LM(7, 13) == 91) passedTests++; // Co-primes
        if (LM(14, 28) == 28) passedTests++;
        if (LM(0, 10) == 0) passedTests++; // Edge case

        // Display test results
        System.out.println("\033[32m" + passedTests + "/" + totalTests + " tests passed.\033[0m");
    }
    static int GD(int a, int b){
        if(a<b){
            int temp = a;
            a = b;
            b = temp;
        }
        if(b==0){
            return a;
        }
        return GD(b, a%b);
    }

    static int LM(int a, int b){
        return (a*b)/GD(a,b);
    }
}
