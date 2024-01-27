import java.util.ArrayList;

public class for_each {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cheetah");
        animals.add("Elephant");
        animals.add("Deer");
        for(String str: animals){
            System.out.print(str + ", ");
        }
        System.out.println();

        String[] names = {"Issac","Tharun","Bharadwaj","Vikram","Nandha"};
        for(String i: names){
            System.out.println(i);
        }

    }
}
