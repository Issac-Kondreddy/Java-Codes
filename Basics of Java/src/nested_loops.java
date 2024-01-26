import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args) {
        //nested loop - kop inside a loop
        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        String symbol = "";
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of columns: ");
        columns = scanner.nextInt();
        System.out.println("Enter your symbol: ");
        symbol = scanner.next();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    }
}
