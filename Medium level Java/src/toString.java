public class toString {
    public static void main(String[] args) {
        //toString - special method that all objects inherit taht
        //returns a string that "textually represnts an object"
        Racecar  car1 = new Racecar();
        System.out.println(car1.toString());
        System.out.println(car1.make);

    }
}

class Racecar{
    String make ="Ford";
    String model = "Mustang";
    int year = 2021;
    String color = "Blue";

    //overriding a tostring method to print all variables
    //so instead of getting address we get the values this is explicit

    public String toString(){
        return make + "\n" + model + "\n" + color + "\n" + year;
    }
}
