package dynamic_polymorphism;

import javax.xml.crypto.dsig.Manifest;
import java.util.Scanner;

public class Main {
    //polymorphism - many forms
    //dynamic - during runtime
    //Ex: Tesla - a car, a vehicle, a object
    public static void main(String[] args) {
        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal do you need? ");
        System.out.println("(1=dog) or (2=cat)");
        int choice = scanner.nextInt();
        if(choice==1){
            animal = new Dog();
            animal.speak();;
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            animal.speak();
            System.out.println("Invalid choice");
        }

    }
}
