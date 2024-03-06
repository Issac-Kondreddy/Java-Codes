package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,4,5,7,9,11,14,17,24,46};
        int n = arr.length;
        int key1 = 24;
        int key2 = 46;
        int key3 = 1;
        int key4 = 11;
        int key5 = 22;
        System.out.println(LS(arr, n, key1));
        System.out.println(LS(arr, n, key2));
        System.out.println(LS(arr, n, key3));
        System.out.println(LS(arr, n, key4));
        System.out.println(LS(arr, n, key5));
    }
    public static int LS(int[] arr, int length, int key){
        if(length==1 && arr[0] == key){
            return 0;
        }
        if(length==1 && arr[0]!=key){
            return -1;
        }
        for(int i=0; i<length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
