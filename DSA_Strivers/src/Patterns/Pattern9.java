package Patterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        /*
         *
        ***
       *****
       *****
        ***
         *
        */
        Scanner sc = new Scanner(System.in);
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
        for(int row=1;row<=n;row++){
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
            for(int cols=1;cols<2*(n-row);cols++){
                System.out.print("*");
            }
            for(int space=0;space<row;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
