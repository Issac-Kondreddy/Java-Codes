import java.util.Scanner;
public class logical_operators {
    public static void main(String[] args) {
        //logical operators - used to connect two or more expressions
        //&& - and
        // ||- or
        // ! - not
        int temp = 219;
        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>=20 && temp<=30){
            System.out.println("it is warm outside");
        }
        else{
            System.out.println("It is cold outside");
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("You are playing a game!! Please q or Q to quit");
        String response = scanner.next();
        if(response.equals("q")|| response.equals("Q")){
            System.out.println("You quit the game");
        }
        else{
            System.out.println("You are still in game");
        }

        System.out.println("You are playing a game!! Please q or Q to quit");
        String response1 = scanner.next();
        if(!response1.equals("q") && !response1.equals("Q")){
            System.out.println("You are still in game");
        }
        else{
            System.out.println("You quit the game");
        }

    }
}
