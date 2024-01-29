package Bit_Manipulation.CheckKthBit;

public class using_rightshift {
    public static void main(String[] args) {
        int n = 3; //011
        int k =2;
        System.out.println(kthbit(n,k));
    }
    public static boolean kthbit(int n, int k){
        int flag = n>>k;
        return ((flag&1)!=0);
    }
}
