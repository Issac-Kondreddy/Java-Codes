package Inner_Classes;

public class Local_Inner_Class {
    public void outerMethod() {
        int localVar = 10;

        class LocalInner {
            public void innerMethod() {
                System.out.println("Local inner method");
                System.out.println("Local variable: " + localVar);
            }
        }

        LocalInner inner = new LocalInner();
        inner.innerMethod();
    }
}

