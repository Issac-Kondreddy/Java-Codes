package Sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,8,9,3,14,15,76};
        System.out.print("Array Before Sorting: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print("Array After Sorting: ");
        System.out.print(Arrays.toString(insertionsort(arr)));

    }
    public static int[] insertionsort(int[] arr){
        for(int i = 1;i<arr.length;i++){
            int j = i-1;
            int temp = arr[i];
            while(j>=0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }
        return arr;
        }
}
