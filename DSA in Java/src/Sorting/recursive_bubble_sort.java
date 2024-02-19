package Sorting;

import java.util.Arrays;

public class recursive_bubble_sort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,8,9,3,14,15,76};
        int n = arr.length;
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("After Sorting: ");
        System.out.println(Arrays.toString(rbs(arr, n)));
    }

    public static int[] rbs(int[] arr, int n) {
        if(n==1){
            return arr;
        }
        boolean swap = false;
        for(int i =0; i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                swap = true;
            }
        }
        if(!swap){
            return arr;
        }
        return rbs(arr, n-1);

    }
}
