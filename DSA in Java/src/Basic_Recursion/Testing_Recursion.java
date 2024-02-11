package Basic_Recursion;

public class Testing_Recursion {
    public static void main(String[] args) {
        //recursion - A function calling itself until base case is met
        int n = 3;
        recursion(n);

    }
    public static void recursion(int num){
        if(num<1){
            return;
        }
        else{
            System.out.printf("%d ",num);
            recursion(num-1);
            System.out.printf("%d ", num);
        }
    }
}
