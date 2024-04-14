package Basics;

import java.util.ArrayList;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        /*
        Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.

        Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.
        Constraints
        0<= 'n' <=10000
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        ArrayList<Integer> evennumbers = new ArrayList<>();
        ArrayList<Integer> oddnumbers = new ArrayList<>();
        while(number>0){
            int remainder = number%10;
            if(remainder%2==0){
                evennumbers.add(remainder);
            }
            else{
                oddnumbers.add(remainder);
            }
            number = number/10;
        }
        int evensum = 0;
        int oddsum = 0;
        for(int i = 0;i<evennumbers.size();i++){
            evensum += evennumbers.get(i);
        }
        for(int i = 0;i<oddnumbers.size();i++){
            oddsum += oddnumbers.get(i);
        }
        System.out.println("Even numbers sum: "+ evensum);
        System.out.println("Odd numbers sum : "+ oddsum);
    }
}
