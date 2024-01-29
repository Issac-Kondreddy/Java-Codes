public class super_keyword {
    public static void main(String[] args) {
        //super - keyword refers to superclass of an object
        Hero hero = new Hero("Batman", 42, "144");
        System.out.println(hero.name);
        System.out.println(hero.age);
        System.out.println(hero.power);
    }
}

class Person{
    String name;
    int age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Hero extends Person{
    String power;
    Hero(String name, int age, String power){
        super(name, age);
        this.power = power;
    }

}
