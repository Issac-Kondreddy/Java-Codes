package Inner_Classes;

public class Member_Inner_Classes {
    private int outerField;

    public void outerMethod() {
        System.out.println("Outer method");
    }

    class Inner {
        public void innerMethod() {
            outerField = 10; // Accessing outer class field
            outerMethod(); // Accessing outer class method
            System.out.println("Inner method");
        }
    }
}

