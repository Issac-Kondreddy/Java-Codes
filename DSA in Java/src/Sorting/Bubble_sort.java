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
        for(int i=n;i>0;i--){
            for(int j=1;j<i;j++){
                if(arr[j-1]>arr[j]){
                   int temp = arr[j-1];
                   arr[j-1] = arr[j];
                   arr[j] = temp;
                }
            }
        }
      return arr;
    }
}
