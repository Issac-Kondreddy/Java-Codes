import java.util.ArrayList;

public class multi_arraylist {
    public static void main(String[] args) {
        //2d arraylist - dynamic list of lists
        ArrayList<String> bakerylist = new ArrayList<String>();
        bakerylist.add("Pasta");
        bakerylist.add("Cakes");
        bakerylist.add("Garlic Bread");


        ArrayList<String> producelist = new ArrayList<String>();
        producelist.add("tomzatoes");
        producelist.add("pepper");
        producelist.add("garlic");

        ArrayList<String> drinkslist = new ArrayList<String>();
        drinkslist.add("sprite");
        drinkslist.add("thups up");

        ArrayList<ArrayList<String>> grocerylist = new ArrayList<ArrayList<String>>();
        grocerylist.add(bakerylist);
        grocerylist.add(producelist);
        grocerylist.add(drinkslist);

        System.out.println(grocerylist.get(2));

        System.out.println(grocerylist.get(1).get(2));

    }
}
