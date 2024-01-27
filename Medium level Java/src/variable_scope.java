import javax.print.attribute.standard.PrinterMakeAndModel;
import java.util.Random;

public class variable_scope {
    public static void main(String[] args) {
        //local -declared inside a method visible to the method
        //Global -declared outside but within in a class visible to all within class
        diceroller dice = new diceroller();
    }
}
class diceroller{
    Random random = new Random(); //Global
    diceroller(){

        int number = 0; //local
        roll(random, number);
    }
    void roll(Random random, int number){
        number = random.nextInt(6);
        System.out.println(number);
    }
}
