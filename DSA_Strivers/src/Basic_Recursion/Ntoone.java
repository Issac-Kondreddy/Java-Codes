package Basic_Recursion;

public class Ntoone {
    public static void main(String[] args) {
        Ntoone(6);
    }
    public static void Ntoone(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        Ntoone(n-1);
    }
}
