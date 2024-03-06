package Sorting;

import java.awt.image.renderable.RenderedImageFactory;
import java.util.ArrayList;
import java.util.Arrays;

public class Merge_sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 8, 9, 3, 14, 15, 76};
        System.out.print("Array Before Sorting: ");
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.print("Array After Sorting: ");
        mergesort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergesort(int[] arr, int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2; // More robust way to calculate mid
            mergesort(arr, low, mid);
            mergesort(arr, mid + 1, high);
            merge(arr, low, mid, high);
        }
    }


    public static void merge(int[] arr, int low, int mid, int high) {
        int n1 = mid - low + 1;
        int n2 = high - mid;

        // Temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; ++i)
            L[i] = arr[low + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Merge temp arrays
        int i = 0, j = 0;
        int k = low;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}

