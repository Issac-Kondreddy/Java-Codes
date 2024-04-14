package Basics;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        /*
                Programming languages have some conditional / decision-making statements that execute when some specific condition is fulfilled.

        If-else is one of the ways to implement them.

        You are given two numbers 'a' and 'b'.

        Compare the numbers and print the relation.

        Print “smaller”, “greater” or “equal” when ‘a’ is smaller than ‘b’, greater than ‘b’, or equal to ‘b’ respectively.

         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter value of b: ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("Greater");
        } else if (a<b) {
            System.out.println("smaller");
        }else {
            System.out.println("Equal");
        }
    }
}
