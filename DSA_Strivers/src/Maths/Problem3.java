package Maths;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        //Given a number check if it is a palindrome.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        checkpalindrome(n);
    }
    public static void checkpalindrome(int n){
        int original = n;
        int reversed =0;
        while(n>0){
            int rem = n%10;
            reversed = reversed* 10 + rem;
            n = n/10;
        }
        if(reversed == original){
            System.out.println("Given NUmber is a palindrome.");
        }
        else{
            System.out.println("Given NUmber is not a palindrome.");
        }
    }
}
