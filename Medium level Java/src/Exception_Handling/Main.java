package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //exception handling - an event occured during execution of program
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter a whole number: ");
            int x = scanner.nextInt();
            System.out.println("Enter a whole number: ");
            int y = scanner.nextInt();
            int z = x/y;
            System.out.println("result : " + z);
        }
        catch(ArithmeticException e){
            System.out.println("Dont try with Zero");
        }
        catch (InputMismatchException e){
            System.out.println("Please enter a number rather another something!!!");
        }
        catch(Exception e){
            System.out.println("Something error occured!!");
        }
        finally {
            scanner.close();
        }


    }
}
