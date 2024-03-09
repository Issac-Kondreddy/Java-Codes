package Arrays.rotations.temporary_array_method;

import java.util.Arrays;

public class right_rotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int rightrotate = 3;
        System.out.println(Arrays.toString(trr(arr, rightrotate)));
    }
    public static int[] trr(int[] arr, int right_rotate_count){
        int[] temp = new int[right_rotate_count];
        for(int i = 0; i < right_rotate_count; i++){
            temp[i] = arr[arr.length - right_rotate_count + i];
        }
        for(int i = arr.length - right_rotate_count - 1; i >= 0; i--){
            arr[i + right_rotate_count] = arr[i];
        }
        for(int i =0;i<right_rotate_count;i++){
            arr[i] = temp[i];
        }
        return arr;
    }
}
