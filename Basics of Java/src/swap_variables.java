public class swap_variables {
    public static void main(String[] args) {
        String x = "Water";
        String y = "Kool-Aid";
        System.out.println("Before swapping: ");
        System.out.println("x: "+x);
        System.out.println("y: "+y);
        String tmp;
        tmp = x;
        x = y;
        y = tmp;
        System.out.println("After Swaping: ");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        //for integers if without third variable
        int a = 4;
        int b = 5;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.print("a: " +a);
        System.out.print("b: " +b);
        System.out.println();

        //for strings without third variable

        x = x + y;
        y = x.substring(0, x.length()-y.length());
        x = x.substring(y.length());
        System.out.println(x);
        System.out.println(y);

    }
}
