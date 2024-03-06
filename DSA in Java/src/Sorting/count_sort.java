package Sorting;

import java.util.Arrays;

public class count_sort {
    public static int[] countsort(int[] arr){
        int max = arr[0];
        for(int num:arr){
            if(num>max){
                max=num;
            }
        }
        int[] frequencyarrray = new int[max+1];
        for(int num:arr){
            frequencyarrray[num]++;
        }
        int index = 0;
        for(int i=0;i<=max;i++){
            while(frequencyarrray[i]>0){
                arr[index]=i;
                index++;
                frequencyarrray[i]--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr  = {3,4,5,1,2,2,3,8,9,0,1};
        System.out.println(Arrays.toString(countsort(arr)));
    }
}
