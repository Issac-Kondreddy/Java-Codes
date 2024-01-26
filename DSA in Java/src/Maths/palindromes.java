package Maths;

public class palindromes {
    public static void main(String[] args) {
        testCheckPalindrome(); // Run tests
    }
   public static boolean checkpalindrome(int number){
        if(number<0){
            return false;
        }
        int original = number;
        int reverse = 0;
        while(number>0){
            int remainder = number%10;
            reverse = reverse*10 + remainder;
            number /= 10;
        }
        return original==reverse;
   }

    public static void testCheckPalindrome() {
        System.out.println(checkpalindrome(121) == true ? "Test Passed" : "Test Failed: Expected true, got " + checkpalindrome(121));
        System.out.println(checkpalindrome(123) == false ? "Test Passed" : "Test Failed: Expected false, got " + checkpalindrome(123));
        System.out.println(checkpalindrome(5) == true ? "Test Passed" : "Test Failed: Expected true, got " + checkpalindrome(5));
        System.out.println(checkpalindrome(0) == true ? "Test Passed" : "Test Failed: Expected true, got " + checkpalindrome(0));
        System.out.println(checkpalindrome(123454321) == true ? "Test Passed" : "Test Failed: Expected true, got " + checkpalindrome(123454321));
        System.out.println(checkpalindrome(-121) == false ? "Test Passed" : "Test Failed: Expected false, got " + checkpalindrome(-121));
    }
}
