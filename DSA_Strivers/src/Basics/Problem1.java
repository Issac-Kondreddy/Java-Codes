package Basics;

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        //
        //Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.
        //
        //1, if the character is an uppercase alphabet (A - Z).
        //0, if the character is a lowercase alphabet (a - z).
        //-1, if the character is not an alphabet.
        //

        Scanner sc = new Scanner(System.in);
        char alpha = sc.next().charAt(0);
        if(alpha >='A' && alpha<='Z'){
            System.out.print(1);
        }
        else if(alpha>='a' && alpha<='z'){
            System.out.print(0);
        }
        else{
            System.out.print(-1);
        }

    }
}
