package Patterns;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        /*
            *
           ***
          *****
         *******
        *********
       ***********
         */
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=1;row<=n;row++){
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            for(int col = 1;col<=2*row-1;col++){
                System.out.print("*");
            }
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
 }
