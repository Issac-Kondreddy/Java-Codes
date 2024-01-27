public class overloaded_constructors {
    public static void main(String[] args) {
        //overloaded constructors - multiple constructors same name -different parameters
        Pizza pizza = new Pizza("Flat", "Tomato", "Macrroni", "Chicken");
        System.out.println("Here are the ingredients of the pizza made: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.cheese);
        System.out.println(pizza.sauce);
        System.out.println(pizza.topping);
        Pizza pizza1 = new Pizza("Flat", "Tomato",  "Chicken");
        System.out.println("Here are the ingredients of the pizza made: ");
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.topping);
        Pizza pizza2 = new Pizza("Flat");
        System.out.println("Here are the ingredients of the pizza made: ");
        System.out.println(pizza2.bread);
    }
}


class Pizza{
    String bread;
    String sauce;
    String cheese;
    String topping;
    Pizza(String bread, String sauce, String cheese, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.cheese = cheese;
        this.topping = topping;
    }
    Pizza(String bread, String sauce, String topping) {
        this.bread = bread;
        this.sauce = sauce;
        this.topping = topping;
    }
    Pizza(String bread) {
        this.bread = bread;
    }

}