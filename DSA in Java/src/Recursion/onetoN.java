package Recursion;

public class onetoN {
    public static void main(String[] args) {
        //print 1 to N using loops
        function(10);
    }

    public static void function(int number){
        if(number<1){
            return;
        }
        else{
            function(number-1);
            System.out.printf("%d ", number);
        }
    }
}
