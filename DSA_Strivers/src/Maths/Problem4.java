package Maths;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        //Given a number, check if it is Armstrong Number or Not
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(Armstrong(n));
    }
    public static boolean Armstrong(int n){
        int original = n;
        int count = countdigits(n);
        int sum = 0;
        while(n>0){
            int temp = n%10;
            sum += Math.pow(temp, count);
            n = n/10;
        }
        if(sum==original) {
            return true;
        }
        return false;
    }

    public static int countdigits(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }
}

