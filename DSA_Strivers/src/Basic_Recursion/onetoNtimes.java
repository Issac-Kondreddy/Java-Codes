package Basic_Recursion;

public class onetoNtimes {
    public static void main(String[] args) {
        onetoNtimes(5);
    }

    public static void onetoNtimes(int n) {
        if(n<1){
            return;
        }
       onetoNtimes(n-1);
        System.out.println(n);
    }
}
