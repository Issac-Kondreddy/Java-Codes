package Sorting;

import java.util.Arrays;

public class Bubble_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        System.out.print("Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("After Sorting: ");
        System.out.println(Arrays.toString(bubblesort(arr)));
    }
    public static int[] bubblesort(int[] arr){
        int n = arr.length;
        for(int i =n-1; i>=1;i--){
            for(int j = 0;j<i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
      return arr;
    }
}
