package Basic_Hashing;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Basic_Hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Getting the Size of array and updating the elements of array
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int[] arr =  new int[n];
        System.out.println("Enter the elements of Array: ");
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        //Updating the frequencies of Elements
        int[] hashtable = new int[n+3];
        for(int i = 0;i<n;i++){
            hashtable[arr[i]] += 1;
        }
        //Give query get count
        System.out.print("Enter the number of elements you want to search: ");
        int q = sc.nextInt();
        while(q--!=0){
            int number = sc.nextInt(); //query number
            System.out.printf("%d is repeated %d times", number, hashtable[number]);
            System.out.println();
        }
    }
}
