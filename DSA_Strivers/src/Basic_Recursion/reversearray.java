package Basic_Recursion;
import java.util.Arrays;

public class reversearray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
        reversearray(arr);
        ptrmtrevarrat(arr);
        System.out.println("Reversed Array through recursive method : "+Arrays.toString(recursive_rev_arr(arr1, 0, arr1.length-1)));
    }
    public static void reversearray(int[] arr){
        int[] reversed_array = new int[arr.length];
        for(int i=0; i<reversed_array.length;i++){
            reversed_array[i] = arr[arr.length-i-1];
        }
        System.out.println("Reversed Array is " + Arrays.toString(reversed_array));
    }

    public static void ptrmtrevarrat(int[] arr){
        int p1 = 0; int p2 = arr.length-1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p2--;
            p1++;
        }
        System.out.println("Reversed Array is " + Arrays.toString(arr));
    }
    public static int[] recursive_rev_arr(int[] arr, int start, int end){
        if(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            recursive_rev_arr(arr, start+1, end-1);
        }
        return arr;
    }
}
