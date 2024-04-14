package Basics;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        /*
        Data type refers to the type of value a variable has and the way the computer interprets it.

        Each data type has a different size. You’ve studied 5 different data types and the sizes of the data types:
        Integer: 4 bytes
        Long: 8 bytes
        Float: 4 bytes
        Double: 8 bytes
        Character: 1 byte

        You’re given a data type. Print its size in bytes.
         */

        Scanner sc =  new Scanner(System.in);
        String Datatype = sc.next();
        try {
            switch (Datatype) {
                case "Long":
                    System.out.println(8);
                    break;
                case "Double":
                    System.out.println(8);
                    break;
                case "Character":
                    System.out.println(1);
                    break;
                case "Integer":
                    System.out.println(4);
                    break;
                case "Float":
                    System.out.println(4);
                    break;
                default:
                    System.out.println("Please Enter Correct Datatype");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
