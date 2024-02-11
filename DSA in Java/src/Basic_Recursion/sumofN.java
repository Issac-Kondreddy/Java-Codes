package Basic_Recursion;

public class sumofN {
    public static void main(String[] args) {
        System.out.println(fun(100));
    }

    public static int fun(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return n + fun(n-1);
        }
    }
}
