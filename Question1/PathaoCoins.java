package CourseWork.Question1;

//1.b 
import java.util.Arrays;

public class PathaoCoins {
    public static void main(String[] args) {
        int[] rating = { 1, 0, 2 };
        int minimumCoins = minimumCoins(rating);
        System.out.println("Minimum number of coins required: " + minimumCoins);
    }

    public static int minimumCoins(int[] rating) {
        int n = rating.length;
        int[] coins = new int[n];

        // Initialize coins array with 1 coin for each position.
        Arrays.fill(coins, 1);// Initially, assign 1 coin to each position.

        // Iterate forward to adjust coins based on increasing ratings.
        for (int i = 1; i < n; i++) {
            if (rating[i] > rating[i - 1]) {
                coins[i] = coins[i - 1] + 1;// Increase coins if rating is higher than previous.
            }
        }
        // Iterate backward to ensure decreasing ratings also affect coin adjustments.
        for (int i = n - 2; i >= 0; i--) {
            if (rating[i] > rating[i + 1] && coins[i] <= coins[i + 1]) {
                coins[i] = coins[i + 1] + 1;// Increase coins if rating is higher than next and not already greater.
            }
        }

        int totalCoins = 0;
        for (int coinsCount : coins) {
            totalCoins += coinsCount;// Calculate the total coins needed.
        }

        return totalCoins;
    }

}
