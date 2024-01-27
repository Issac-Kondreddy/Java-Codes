package Maths.Primes;

public class CheckPrime {
    public static void main(String[] args) {
        // Test cases
        testPrime(2, true);
        testPrime(3, true);
        testPrime(5, true);
        testPrime(35, false);
        testPrime(37, true);
        testPrime(49, false);
        testPrime(97, true);
        testPrime(100, false);
    }


    static boolean CP(int n){
        if(n<2){
            return false;
        }
        if(n==2){
            return true;
        }
        int i=2;
        while(i<n){
            if(n%i!=0){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
    static void testPrime(int number, boolean expected) {
        boolean isPrime = CP(number);
        if (isPrime == expected) {
            System.out.println("Test Passed for " + number + ": Expected " + expected + ", Got " + isPrime);
        } else {
            System.out.println("Test Failed for " + number + ": Expected " + expected + ", Got " + isPrime);
        }
    }
}
