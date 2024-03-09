package Arrays.rotations;

import java.util.Arrays;

public class Juggling_Algorithms {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int leftrotate = 3;
        System.out.println(Arrays.toString(juggling(arr, leftrotate)));
    }

    public static int gcd(int length_of_array, int rotate_count) {
        if (rotate_count == 0) {
            return length_of_array;
        } else {
            return gcd(rotate_count, length_of_array % rotate_count);
        }
    }

    public static int[] juggling(int[] arr, int rotate_count) {
        int n = arr.length;
        int i, j, k, temp;
        for (i = 0; i < gcd(rotate_count, n); i++) {
            temp = arr[i];
            j = i;
            while (true) {
                k = j + rotate_count;
                if (k >= n) // The element has to be shifted to its rotated position
                    k = k - n;
                if (k == i) // The element is already in its rotated position
                    break;
                arr[j] = arr[k];
                j = k;
            }
            arr[j] = temp;
        }
        return arr;
    }
}
