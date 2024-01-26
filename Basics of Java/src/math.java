
import java.util.Scanner;
public class math {
    public static void main(String[] args) {
        double x = 3.14;
        double y = 10;
        double z = Math.max(x,y);
        double a = Math.sqrt(y);
        double b = Math.ceil(x);
        double c = Math.floor(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(z);

        double m;
        double n;
        double o;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Side m: ");
        m = scanner.nextInt();
        System.out.println("Enter side n: ");
        n = scanner.nextInt();

        o = Math.sqrt((m*m) + (n*n));

        System.out.println("Longest side: "+o);


    }
}
