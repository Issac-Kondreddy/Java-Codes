package package1;
import package2.*;
public class A {
    public static void main(String[] args) {
        C c =  new C();
        //System.out.println(c.defaultmessage); //cant be accessed
        //System.out.println(c.publicmessage);
        //protected String Protectedmessage = "This is protected from A";
    }
}
