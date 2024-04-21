package Maths;

import java.util.Scanner;

public class Problen7 {
    public static void main(String[] args) {
        /*
        Problem Statement: Given a number, check whether it is prime or not.
        A prime number is a natural number that is only divisible by 1 and by itself
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = sc.nextInt();
        System.out.println(prime(n));
        System.out.println(optimalprime(n));
    }
    public static boolean prime(int n){
        for(int i=2; i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static boolean optimalprime(int n){
        for(int i=2; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
