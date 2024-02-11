package Basic_Recursion;

public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(palin("mom")); // true
        System.out.println(palin("racecar")); // true
        System.out.println(palin("12321")); // true
        System.out.println(palin("a")); // true
        System.out.println(palin("")); // true, considering an empty string as palindrome

        // Test with non-palindromes
        System.out.println(palin("java")); // false
        System.out.println(palin("palindrome")); // false
        System.out.println(palin("123456")); // false

        // Test with case sensitivity
        System.out.println(palin("Mom")); // false, 'M' and 'm' are considered different
        System.out.println(palin("Racecar")); // false, case sensitive

        // Test with spaces and punctuation (assuming these should be considered in the comparison)
        System.out.println(palin("A man a plan a canal Panama")); // false, spaces are considered
        System.out.println(palin("No 'x' in Nixon")); // false, punctuation and case are considered
    }

    public static boolean palin(String s){
        if(s.isBlank() || s.length()==1){
            return true;
        }
        if(s.charAt(0) == s.charAt(s.length()-1)){
            return palin(s.substring(1,s.length()-1));
        }
        else{
            return false;
        }

    }
}
