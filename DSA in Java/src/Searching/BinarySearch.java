package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,11,14,17,24,46};
        int key1 = 24;
        int low = 0;
        int high = arr.length;
        int key2 = 46;
        int key3 = 1;
        int key4 = 11;
        int key5 = 22;
        System.out.println(BS(arr, low,high, key1));
        System.out.println(BS(arr, low,high, key2));
        System.out.println(BS(arr, low,high, key3));
        System.out.println(BS(arr, low,high, key4));
        System.out.println(BS(arr, low,high, key5));
    }
    public static int BS(int[] arr, int low, int high, int target){
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
