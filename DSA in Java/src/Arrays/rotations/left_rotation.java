package Arrays.rotations;

import java.util.Arrays;

public class left_rotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int leftrotate = 3;
        System.out.println(Arrays.toString(leftrotate(arr, leftrotate)));

    }
    public static int[] leftrotate(int[] arr, int left_rotate_count){

        for(int i=1;i<=left_rotate_count;i++){
            int temp = arr[0];
            for(int j = 0; j<= arr.length-2;j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        return arr;
    }
}
