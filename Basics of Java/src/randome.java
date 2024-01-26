import java.util.Random;
public class randome {
    public static void main(String[] args) {
        Random random  = new Random();
        //these are not true randoms but psuedorandoms

        int x = random.nextInt();
        System.out.println(x);
        //to limit
        int y = random.nextInt(1,6);
        System.out.println(y);
        double d = random.nextDouble();
        System.out.println(d);

        boolean g = random.nextBoolean();
        System.out.println(g);



    }
}
