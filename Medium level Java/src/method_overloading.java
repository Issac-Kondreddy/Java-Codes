public class method_overloading {
    public static void main(String[] args) {
        //method overloading - same name but paramaters are different
        System.out.println(add(2,3));
        System.out.println(add(2,3,4,5));
        System.out.println(add(3,4,5));
        System.out.println(add(1.0,2.0));
        System.out.println(add(1.0,2.0,3.0));
        System.out.println(add(1.0,2.0,3.0,4.0));
    }
    static int add(int a, int b){
        System.out.println("This is Method 1");
        return a+b;
    }
    static int add(int a, int b, int c){
        System.out.println("This is Method 2");
        return a+b+c;
    }
    static int add(int a, int b, int c, int d){
        System.out.println("This is Method 3");
        return a+b+c+d;
    }

    static double add(double a, double b){
        System.out.println("This is Method 4");
        return a+b;
    }
    static double add(double a, double b, double c){
        System.out.println("This is Method 5");
        return a+b+c;
    }
    static double add(double a, double b, double c, double d){
        System.out.println("This is Method 6");
        return a+b+c+d;
    }
}
