package Inner_Classes;


public class Static_Nested_Class {
    private static int outerStaticField;

    public static void outerStaticMethod() {
        System.out.println("Outer static method");
    }

    static class StaticInner {
        public void innerMethod() {
            outerStaticField = 10; // Accessing outer class static field
            outerStaticMethod(); // Accessing outer class static method
            System.out.println("Static inner method");
        }
    }
}
