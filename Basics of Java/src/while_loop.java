import java.util.Scanner;

public class while_loop {
    public static void main(String[] args) {
        //while - executes as long as condition is true
        Scanner scanner = new Scanner(System.in);
        String name = "";
        while(name.isBlank()){
            System.out.print("Enter your Name: ");
            name = scanner.nextLine();
        }
        System.out.println("Hello " +name);

//        do{
//            System.out.print("Enter your Name: ");
//            name = scanner.nextLine();
//        }while(name.isBlank());

        //do while loop
    }
}
