package Interface;

public class interafaces {
    public static void main(String[] args) {
        //instance -  it is a templates can be applied to class
        Rabbit rabbit =new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();
        rabbit.flee();
        hawk.hunt();
        fish.flee();
        fish.hunt();
    }
}
