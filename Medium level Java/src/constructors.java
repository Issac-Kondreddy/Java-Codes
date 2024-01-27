public class constructors {
    public static void main(String[] args) {
        //constructors - special method that is called when an object is created
        //with constructors  we can created different objects with different properties
        human human1 = new human("issac",23, 80);
        human human2 = new human("Vissu",22, 90);
        System.out.println(human1.age);
        System.out.println(human1.weight);
        System.out.println(human1.name);
        human1.eat();
        human1.drinking();
        System.out.println();
        System.out.println(human2.age);
        System.out.println(human2.weight);
        System.out.println(human2.name);
        human2.eat();
        human2.drinking();

    }
}

class human{
    String name;
    double weight;
    int age;
    human(String name, int age, double weight){
        this.name = name;
        this.age=age;
        this.weight = weight;
        //this - used to assign these variables to each specific object created
    }
    void eat(){
        System.out.println(this.name + " is eating");
    }
    void drinking(){
        System.out.println(this.name + " is Drinking water");
    }

}
