package Basics;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        /*
        Provided 'n' you have to find out the n-th Fibonacci Number.
        Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibo(n));
    }
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
