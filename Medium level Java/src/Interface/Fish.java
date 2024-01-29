package Interface;

public class Fish implements Predator, Prey{
    @Override
    public void flee() {
        System.out.println("Fish is going away");
    }

    @Override
    public void hunt() {
        System.out.println("Fish is chasing smaller fish");
    }
}
