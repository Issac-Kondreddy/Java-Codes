package Basic_Recursion;

public class palinstring {
    public static void main(String[] args) {
        System.out.println(palindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean palindrome(String s){
        s = s.toLowerCase().replaceAll("[^a-z0-9]","");
        if(s.isEmpty() || s.length()==1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return palindrome(s.substring(1, s.length()-1));
        }
        return false;
    }
}
