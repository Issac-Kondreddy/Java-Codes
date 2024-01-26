import java.util.Scanner;
public class input_output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = scanner.nextLine();
        System.out.println("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("What is your favorite food? ");
        String food = scanner.nextLine();
        System.out.println("The name of user is "  +name);
        System.out.println("The age of user is " +age);
        System.out.println("Your favorite food is " +food);

    }
}
