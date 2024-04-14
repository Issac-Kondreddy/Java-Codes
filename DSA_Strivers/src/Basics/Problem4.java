package Basics;

import java.util.Scanner;

public class Problem4 {
    /*
            In a menu-driven program, the user is given a set of choices of things to do (the menu) and then is asked to select a menu item.

    There are 2 choices in the menu:

    Choice 1 is to find the area of a circle having radius 'r'.
    Choice 2 is to find the area of a rectangle having dimensions 'l' and 'b'.

    You are given the choice 'ch' and an array 'a'.

    If ‘ch’ is 1, ‘a’ contains a single number ‘r’. If ‘ch’ is 2, ‘a’ contains 2 numbers, ‘l’ and ‘b’.

    Consider the choice and print the appropriate area.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array = new double[2];
        int choice = sc.nextInt();
        if(choice == 1){
            array[0] = sc.nextInt();
        }
        if(choice==2){
            for(int i=0;i<2;i++){
                array[i] = sc.nextInt();
            }
        }

        switch (choice){
            case 1:
                System.out.println("Area: " +Math.PI * array[0] * array[0]);
                break;
            case 2:
                System.out.println("Area : "+ array[0] * array[1]);
                break;
            default:
                System.out.println("Finish");
        }
    }
}
