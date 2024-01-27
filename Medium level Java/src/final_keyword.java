public class final_keyword {
    public static void main(String[] args) {
        double pii = 3.14159;
        pii = 4;
        System.out.println(pii);

        final double PI = 3.14159;
        System.out.println(PI);
        //final - once declared cant be reassigned tp another value
    }
}
