package Basic_Recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int start = 0;
        int end = arr.length-1;
        reversearray(arr, start, end);
        System.out.println(Arrays.toString(arr));

    }
    public static void reversearray(int[] a, int start, int end){
        if(start>=end){
            return;
        }
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
        reversearray(a, start+1, end-1);
    }
}
