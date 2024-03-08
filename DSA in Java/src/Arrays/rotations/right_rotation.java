package Arrays.rotations;

import java.util.Arrays;

public class right_rotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int rightrotate = 3;
        System.out.println(Arrays.toString(rightrotate(arr, rightrotate)));
    }

    public static int[] rightrotate(int[] arr, int right_rotate_count){
        for(int i = 1; i<=right_rotate_count;i++){
            int temp = arr[arr.length-1];
            for(int j = arr.length-2;j>=0;j--){
                arr[j+1] = arr[j];
            }
            arr[0] = temp;
        }
        return arr;
    }
}
