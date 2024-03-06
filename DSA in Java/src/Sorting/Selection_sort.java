package Sorting;

import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,2,1,9,8};
        System.out.print("Array Before Sorting: ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Array after sorting: ");
        System.out.println(Arrays.toString(selection_sort(arr)));

    }
    public static int[] selection_sort(int[] a){
        int n = a.length;
        if(n==1){
            System.out.println("Array is already sorted");
        }
        for(int i=0;i<=n-1;i++){
            int min_index = i;
            for(int j=i+1;j<n;j++){
                if(a[j]<a[min_index]){
                    min_index=j;
                }
            }
            int temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }
        return a;
    }
}
