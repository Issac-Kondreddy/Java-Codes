package Recursion;

public class Ntoone {
    //print 1 to N using loops
    public static void main(String[] args) {
        funNtoone(10);
    }

    public static void funNtoone(int number) {
        if (number < 1) {
            return;
        } else {
            System.out.printf("%d ", number);
            funNtoone(number - 1);
        }
    }
}

