package Basic_Recursion;

public class PrintNtimes {
    public static void main(String[] args) {
        NameNtimes("Issac", 5);
    }
    public static String NameNtimes(String str, int n){
        if(n==0){
            return str;
        }
        System.out.println(str);
        return NameNtimes(str, n-1);
    }
}
