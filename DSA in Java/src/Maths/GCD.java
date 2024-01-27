package Maths;

public class GCD {
    public static void main(String[] args) {
        // Test cases
        System.out.println("GCD of 48 and 18 is: " + GD(48, 18)); // Should be 6
        System.out.println("GCD of 20 and 8 is: " + GD(20, 8));   // Should be 4
        System.out.println("GCD of 100 and 0 is: " + GD(100, 0)); // Should be 100
        System.out.println("GCD of 0 and 100 is: " + GD(0, 100)); // Should be 100
        System.out.println("GCD of 7 and 13 is: " + GD(7, 13));   // Should be 1 (co-primes)
        System.out.println("GCD of 14 and 28 is: " + GD(14, 28)); // Should be 14
        System.out.println("GCD of 0 and 0 is: " + GD(0, 0));     // Should be 0 (edge case)
    }

    static int GD(int a, int b){
        if(a < b){
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0){
            return a;
        }
        return GD(b, a % b);
    }
}
