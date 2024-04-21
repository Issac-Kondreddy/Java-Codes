package Maths;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        /*
        Problem Statement: Given a number, print all the divisors of the number.
        A divisor is a number that gives the remainder as zero when divided.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("The Divisors of "+num +" are "+ Divisors(num));
        System.out.println("The Divisors of "+num +" are "+ OptimizedDivisors(num));

    }
    public static ArrayList<Integer> Divisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i=1; i<=n;i++){
            if(n%i==0){
                divisors.add(i);
            }
        }
        return divisors;
    }
    public static ArrayList<Integer> OptimizedDivisors(int n){
        ArrayList<Integer> divisors = new ArrayList<>();
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                divisors.add(i);
                if(i!=n/i){
                    divisors.add(n/i);
                }
            }
        }
        return divisors;
    }
}
