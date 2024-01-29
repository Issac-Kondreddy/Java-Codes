public class objects_Passing {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Racing_cars car = new Racing_cars("BMW");
        Racing_cars car2 = new Racing_cars("Volvo");
        garage.park(car);
        garage.park(car2);
    }
}

class Garage{
    void park(Racing_cars car){
        System.out.println("The "+ car.name + " is parked in Garage!!");
    }

}

class Racing_cars{
    String name;

    Racing_cars(String name){
        this.name = name;
    }
}