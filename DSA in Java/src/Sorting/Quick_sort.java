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
            int j = partition(arr, low, high);
            quicksort(arr,low, j-1);
            quicksort(arr, j+1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j= high+1;
        while(true) {
            do {
                i++;
            } while (i < high && arr[i] <= pivot);
            do {
                j--;
            } while (j > low && arr[j] > pivot);
            if (i >= j) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        arr[low] = arr[j];
        arr[j] = pivot;
        return j;
    }
}
