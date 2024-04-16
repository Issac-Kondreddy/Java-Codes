package Patterns;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        /*
         ***********
          *********
           *******
            *****
             ***
              *
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int row=0;row<=n;row++){
            for(int space=0;space<=row-1;space++){
                System.out.print(" ");
            }
            for(int cols=0;cols<=2*(n-row);cols++){
                System.out.print("*");
            }
            for(int space=0;space<=row-1;space++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
