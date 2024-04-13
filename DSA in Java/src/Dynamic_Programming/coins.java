package Dynamic_Programming;

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of denominations: ");
        int n = scanner.nextInt();
        int[] coins = new int[n];
        System.out.println("Enter the coin denominations: ");
        for(int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();

        int ways = countWays(coins, amount);
        System.out.println("Number of ways to make " + amount + ": " + ways);
    }

    public static int countWays(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        dp[0] = 1; // There's 1 way to make 0 amount: use no coins

        for(int coin : coins) {
            for(int j = coin; j <= amount; j++) {
                dp[j] += dp[j - coin];
            }
        }

        return dp[amount];
    }
}
