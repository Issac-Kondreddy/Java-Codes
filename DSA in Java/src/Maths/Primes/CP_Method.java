package Maths.Primes;

public class CP_Method {
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
    static void testPrime(int number, boolean expected) {
        boolean isPrime = CP_optimized(number);
        if (isPrime == expected) {
            System.out.println("Test Passed for " + number + ": Expected " + expected + ", Got " + isPrime);
        } else {
            System.out.println("Test Failed for " + number + ": Expected " + expected + ", Got " + isPrime);
        }
    }
    static boolean CP_optimized(int n){
        if(n<2){
            return false;
        }
        if (n==2 || n==3){
            return true;
        }
        if (n%2==0 || n%3==0){
            return false;
        }
        int i=5;
        while(i<=Math.sqrt(n)){
            if(n%i!=0){
                i++;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
