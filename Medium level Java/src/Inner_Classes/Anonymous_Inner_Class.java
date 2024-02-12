package Inner_Classes;
public class Anonymous_Inner_Class {
    public void sayHello() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous inner class!");
            }
        };

        new Thread(runnable).start();
    }
}
