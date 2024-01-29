package Bit_Manipulation;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.print("Enter a number: ");
            int a = scanner.nextInt();
            System.out.print("Enter a second number: ");
            int b = scanner.nextInt();
            int result =  a & b;
            int result2 = a|b;
            int result3 = a^b;
            int result4 = ~a;
            int result5 = a<<2;
            int result6 = a>>2;
            int result7 = a>>>2;
            System.out.println("result_and: " + result);
            System.out.println("result_or: " + result2);
            System.out.println("result_xor: " + result3);
            System.out.println("result_not: " + result4);
            System.out.println("result_leftshit: " + result5);
            System.out.println("result_rightshift: " + result6);
            System.out.println("result_unsigned_rightshift: " + result7);
        }catch(InputMismatchException e){
            System.out.println("Enter a number not a character");
        }
    }
}
