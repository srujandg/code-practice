import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Scanner to read input
        Scanner sc = new Scanner(System.in);

        // Number of coins
        int n = sc.nextInt();

        // Array to store coin values
        int[] coins = new int[n];

        int totalSum = 0;

        // Read coin values and calculate total sum
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
            totalSum += coins[i];
        }

        // Sort coins in ascending order
        Arrays.sort(coins);

        int mySum = 0;   // sum of coins I take
        int count = 0;  // number of coins I take

        // Start taking coins from the largest value
        for (int i = n - 1; i >= 0; i--) {
            mySum += coins[i];
            count++;

            // Check if my sum is strictly greater than remaining sum
            if (mySum > totalSum - mySum) {
                break;
            }
        }

        // Output the minimum number of coins
        System.out.println(count);
    }
}
