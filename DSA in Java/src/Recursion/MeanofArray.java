package Recursion;
public class MeanofArray {

    // Method to calculate the sum of array elements recursively
    public static double recursiveSum(double[] arr, int start) {
        if (start == arr.length - 1) {
            // Base case: If the array has one element left, return that element
            return arr[start];
        } else {
            // Recursive step: Sum the current element with the sum of the rest
            return arr[start] + recursiveSum(arr, start + 1);
        }
    }

    // Method to calculate the mean of an array recursively
    public static double meanRecursively(double[] arr) {
        if (arr.length == 0) {
            // Check if the array is empty
            throw new IllegalArgumentException("Array is empty.");
        }
        // Calculate the sum using recursiveSum and divide by the number of elements
        return recursiveSum(arr, 0) / arr.length;
    }

    public static void main(String[] args) {
        double[] arr = {3, 5, 7, 9, 11};
        double mean = meanRecursively(arr);
        System.out.println("The mean of the array is: " + mean);
    }
}
