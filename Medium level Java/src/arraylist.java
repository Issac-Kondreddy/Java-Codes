import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //arraylist - similar to array but resizable, only reference data types(so Integer, Strings, Double, Booelan)
        ArrayList<String> food = new ArrayList<String>();
        food.add("Pizza");
        food.add("Burger");
        food.add("Pasta");
        food.add("Hot dog");
        food.add(1,"Biryani");
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }
        System.out.println();
        food.set(3, "Saphagetti");
        food.remove(3);
        for(int i=0;i<food.size();i++){
            System.out.println(food.get(i));
        }

    }
}
