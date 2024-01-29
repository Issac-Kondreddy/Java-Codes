public class inheritance {
    public static void main(String[] args) {
        //inheritance - one class inherits another class properties
        ccarr car = new ccarr();
        bycycle bicycle = new bycycle();
        car.go();
        car.stop();
        bicycle.go();
        bicycle.stop();
        System.out.println(car.speed);
        System.out.println(bicycle.speed);
        System.out.println(car.doors);
        System.out.println(car.wheels);
        System.out.println(bicycle.wheels);
    }
}

class vehicle{
    double speed;
    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped");
    }
}

class bycycle extends vehicle{
    int wheels = 2;

}

class ccarr extends vehicle{
    int wheels = 4;
    int doors = 4;
}