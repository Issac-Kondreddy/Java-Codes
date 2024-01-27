public class objects {
    public static void main(String[] args) {
        //Object Oreinted Programming
        //Objects - an instance of a class that have methods and variables
        car car1 = new car();
        car car2 = new car();
        System.out.println(car1.color);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.price);
        car1.drive();
        car1.brake();
        System.out.println();
        System.out.println(car2.color);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.price);
        car2.drive();
        car2.brake();
    }//each car has same properties, to resolve this we will use constructors

}

class car{
    String color = "midnight black";
    String make = "Cheverolet";
    String model = "Corvette";
    int year = 2021;
    double price = 45000.00;

    void drive(){
        System.out.println("You drive the car");
    }
    void brake(){
        System.out.println("You applied Brake");
    }

}

