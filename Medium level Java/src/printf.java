public class printf {
    public static void main(String[] args) {
        //printf - an optional method to control format and display text in console
        //using percentage character
        System.out.printf("This is a format String %d", 123);
        System.out.println();
        System.out.printf("%d This is a format String", 123);
        //%d - Integer
        boolean myboolean = true;
        char mychar = '@';
        String mystring = "Issac";
        int myint = 4;
        double mydouble = 30000.14;
        System.out.printf("%b", myboolean);
        System.out.println();
        System.out.printf("%c", mychar);
        System.out.println();
        System.out.printf("%s", mystring);
        System.out.println();
        System.out.printf("%d", myint);
        System.out.println();
        System.out.printf("%f", mydouble);
        System.out.println();
        System.out.printf("Hello %7s",mystring); //width
        System.out.println();
        System.out.printf("You have this much money %.5f", mydouble); //precision
        System.out.println();
        System.out.printf("You have this much money %,f", mydouble); //flags
    }
}
