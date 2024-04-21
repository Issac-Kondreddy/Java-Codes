package Maths;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        //Problem Statement: Given a number N reverse the number and print it.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt();
        reversenumber(number);

    }

    static void reversenumber(int number) {
        int original = number;
        int reversed = 0;
        while(number>0){
            int remainder = number % 10;
            reversed = reversed*10 + remainder ;
            number  = number/10;
        }
        System.out.println("the reversed number is: "+reversed);
    }

}
