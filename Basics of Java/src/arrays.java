import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        //array - used to store multiple values in a single variable
        String[] cars = {"Camry","Corolla","Chevollete","Tesla"};
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        cars[2] = "Mustang";

        String[] car_models = new String[4];
        car_models[0] = "camaro";
        car_models[1] = "camry";
        car_models[2] = "Tesla";
        car_models[3] = "Nissan";
        for(int i=0; i<car_models.length;i++){
            System.out.print(car_models[i]+", ");
        }
    }
}
