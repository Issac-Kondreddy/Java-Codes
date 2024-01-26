package Maths;

public class factorial {
    public static void main(String[] args) {
        testFact();
    }

    public static int fact(int number){
        if (number<0){
            return -1;
        }
        if(number<=1 && number>=0){
            return 1;
        }
        return number * fact(number-1);
    }
    public static void testFact() {
        System.out.println(fact(0) == 1 ? "Test Passed" : "Test Failed: Expected 1, got " + fact(0));
        System.out.println(fact(1) == 1 ? "Test Passed" : "Test Failed: Expected 1, got " + fact(1));
        System.out.println(fact(5) == 120 ? "Test Passed" : "Test Failed: Expected 120, got " + fact(5));
        System.out.println(fact(10) == 3628800 ? "Test Passed" : "Test Failed: Expected 3628800, got " + fact(10));
         System.out.println(fact(-1) == -1 ? "Test Passed" : "Test Failed: Expected -1, got " + fact(-1));
    }
}
