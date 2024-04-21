package Maths;

public class GCD {
    public static void main(String[] args) {
        //Given GCD or HCF of given two numbers
        System.out.println(gcd(3,6));
        System.out.println(gcd(16,4));
        System.out.println(gcd(16,64));
        System.out.println(gcd(24,48));
        System.out.println(GCD(24,48));
        System.out.println(GCD(8,48));

    }
    public static int gcd(int a, int b){
        int minimum = Math.min(a,b);
        int ans = 1;
        for(int i = 2; i <= minimum; i++){
            if(a%i==0 && b%i==0){
                ans = i;
            }
        }
        return ans;
    }

    public static int GCD(int a, int b){
        if(a>b){
            return GCD(b,a);
        }
        if(b==0){
            return a;
        }
        return GCD(a,a%b);
    }
}
