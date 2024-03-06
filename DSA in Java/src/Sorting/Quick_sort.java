package Sorting;

import java.util.Arrays;

public class Quick_sort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,8,9,3,14,15,76};
        int n = arr.length;
        int low = 0;
        int high = n-1;
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("After Sorting: ");
        System.out.println(Arrays.toString(quicksort(arr, low, high)));
    }
    public static int[] quicksort(int[] arr, int low, int high){
        if(low<high){
            int q = partition(arr, low, high);
            quicksort(arr, low, q-1);
            quicksort(arr, q+1,high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low-1;
        for(int j= low; j<=high-1;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
       return i+1;
    }
}
