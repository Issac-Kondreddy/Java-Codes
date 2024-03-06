package Sorting;

import java.util.Arrays;

public class Radixsort {
    public static void main(String[] args) {
        int[] arr = {345,342,11, 88, 9,77, 243};
        int n = arr.length;
        System.out.println(Arrays.toString(RadixSort(arr, n)));
    }

    public static int[] RadixSort(int[] arr, int n){
        int max = GetMax(arr);
        for(int pos=1;max/pos>0;pos *= 10){
            CountSort(arr, n, pos);
        }
        return arr;
    }
    public static int GetMax(int[] arr){
        int max = arr[0];
        for(int num:arr){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
    public static int[] CountSort(int[] arr, int n, int pos){
        int[] output = new int[n];
        int[] count = new int[10];

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            int digit = (arr[i] / pos) % 10;
            count[digit]++;
        }

        // Change count[i] so that count[i] now contains the actual position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / pos) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy the output array to arr[], so that arr[] now contains sorted numbers according to current digit
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }

        return arr;
    }
}
