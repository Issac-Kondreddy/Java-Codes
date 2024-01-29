package package2;
import package1.A;
public class A_sub extends A{
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.defaultmessage);
        System.out.println(c.publicmessage);
        System.out.println(c.protected_message);
    }
}
