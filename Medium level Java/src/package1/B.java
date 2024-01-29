package package1;
import package2.*;
public class B {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicmessage);
        //private String str = "This is private!!"; //private cannot be accessed outisde class

    }


}
