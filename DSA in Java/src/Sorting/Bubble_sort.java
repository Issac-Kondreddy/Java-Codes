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
        for(int i = 0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    int temp =arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
      return arr;
    }
}
