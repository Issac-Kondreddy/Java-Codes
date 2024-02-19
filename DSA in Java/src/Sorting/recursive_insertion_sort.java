package Sorting;

import java.util.Arrays;

public class recursive_insertion_sort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,8,9,3,14,15,76};
        int n = arr.length;
        int i = 0;
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("After Sorting: ");
        System.out.println(Arrays.toString(ris(arr,i,  n)));
    }
    public static int[] ris(int[] arr, int i, int n){
        if(i==n){
            return arr;
        }
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }
        return ris(arr, i+1, n);

    }
}
