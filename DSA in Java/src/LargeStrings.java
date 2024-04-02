import java.util.Random;
public class LargeStrings {
    public static void main(String[] args) {
        //constructor 1
        StringBuffer sb = new StringBuffer();


        //constructor 2
        StringBuffer sb2 = new StringBuffer("Issac Kondreddy");

        //constructor 3

        StringBuffer sb3 = new StringBuffer(30);

        sb.append("Java ");
        sb.append("it is good");
        sb.insert(5, "and python ");
        System.out.println(sb);
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println((char)(97+1));
    }
}
