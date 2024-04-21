package Maths;

import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {
        //Given an integer N, write a program to count the number of digits in N

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        countdigits(number);

    }
    static void countdigits(int n){
        int original = n;
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        System.out.println("The Number of Digits in given number " + original + " is " + count);
    }
}
