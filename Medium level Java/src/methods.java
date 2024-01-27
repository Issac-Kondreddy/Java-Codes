public class methods {
    public static void main(String[] args) {
        //method -  block of code executed whenever called
        greeting("Issac");
        greeting("Bharadwaj");
        greeting("Broo");
        System.out.println(add(3,5));
        System.out.println(checkstr("Hello"));
        System.out.println(areacrc(2));

    }
    //void means method doesn't return anything
    static void greeting(String name){
        System.out.println("Hello "+name);
    }
    //if data types are present in method declaration that means method returns the datatype
    static int add(int a, int b){
        return a+b;
    }
    static boolean checkstr(String name){
        return name.equals("Hello");
    }

    static double areacrc(int radius){
        return 3.14 * Math.pow(radius, radius);
    }
}
