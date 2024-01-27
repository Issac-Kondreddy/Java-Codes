package Maths.Primes;

import java.util.ArrayList;
import java.util.Arrays;

public class SIeve_of_Eratosthenes {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<>();
        primes = SOE(30);
        System.out.println(primes);
    }
    static ArrayList<Integer> SOE(int n){
        boolean[] isPrimes = new boolean[n+1];
        Arrays.fill(isPrimes, true);
        isPrimes[0] = false;
        isPrimes[1] = false;
        for(int i=2;i*i<=n;i++){
            if(isPrimes[i]){
                for(int j = i*i;j<=n;j+=i){
                    isPrimes[j] = false;
                }
            }
        }
        ArrayList<Integer> primes = new ArrayList<>();
        for (int i = 2; i<=n;i++){
            if(isPrimes[i]){
                primes.add(i);
            }
        }
        return primes;
    }
}
