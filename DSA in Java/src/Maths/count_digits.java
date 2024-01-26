package Maths;
import java.util.Scanner;

public class count_digits {
    public static void main(String[] args) {
        testCountDigits(); // Run tests
    }

    public static int countdigits(int num){
        if(num>=0 && num<=9){
            return 1;
        }
        if(num<0){
            num = Math.abs(num);
        }
        int count = 0;
        while(num>0){
            num /= 10;
            count++;
        }
        return count;
    }

    public static void testCountDigits() {
        System.out.println(countdigits(12345) == 5 ? "Test Passed" : "Test Failed: Expected 5, got " + countdigits(12345));
        System.out.println(countdigits(7) == 1 ? "Test Passed" : "Test Failed: Expected 1, got " + countdigits(7));
        System.out.println(countdigits(0) == 1 ? "Test Passed" : "Test Failed: Expected 1, got " + countdigits(0));
        System.out.println(countdigits(-12345) == 5 ? "Test Passed" : "Test Failed: Expected 5, got " + countdigits(-12345));
        System.out.println(countdigits(1234567890) == 10 ? "Test Passed" : "Test Failed: Expected 10, got " + countdigits(1234567890));
        System.out.println(countdigits(123) == 3 ? "Test Passed" : "Test Failed: Expected 3, got " + countdigits(123));
    }
}
