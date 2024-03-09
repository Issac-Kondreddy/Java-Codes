package Arrays.rotations.temporary_array_method;

import java.util.Arrays;

public class left_rotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int leftrotate = 3;
        System.out.println(Arrays.toString(tlr(arr, leftrotate)));
    }
    public static int[] tlr(int[] arr, int left_rotate_count){
        int[] temp = new int[left_rotate_count];
        for(int i=0; i<left_rotate_count;i++){
            temp[i] = arr[i];
        }
        for(int i=left_rotate_count;i<arr.length;i++){
            arr[i-left_rotate_count] = arr[i];
        }
        for(int j=0; j< temp.length;j++){
            arr[arr.length-left_rotate_count+j] = temp[j];
        }
        return arr;
    }
}
