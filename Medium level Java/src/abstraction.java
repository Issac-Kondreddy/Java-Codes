public class abstraction {
    public static void main(String[] args) {
        //abstract - abstract classes cannot be created but subcreated
        //Vehicle vehicle =new Vehicle(); cannot declare a vehicle
        cCar car = new cCar();
        car.go();
    }
}

class cCar extends vVehicle{
    @Override
    void go() {
        System.out.println("The car started moving!!");
    }
}

abstract class vVehicle{
    void go(){
      //cannot add a body
    }
}