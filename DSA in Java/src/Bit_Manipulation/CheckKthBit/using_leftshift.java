package Bit_Manipulation.CheckKthBit;


public class using_leftshift {
    public static void main(String[] args) {
        int n = 4; //0100
        int k = 2;
        System.out.println(Kthbit(n,k));
    }

    public static boolean Kthbit(int n, int k){
        int flag = 1<<k;
        return ((n& flag)!=0);
    }
}
