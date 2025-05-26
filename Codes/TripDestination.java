import java.util.Arrays;
import java.util.Scanner;

public class TripDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of friends
        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();

        int[] amounts = new int[n];
        System.out.println("Enter the maximum amount each friend can spend:");

        // Read each friend's maximum amount
        for (int i = 0; i < n; i++) {
            amounts[i] = scanner.nextInt();
        }

        int highestCost = findHighestAffordableDestination(n, amounts);
        System.out.println("The highest possible cost that all friends can afford together is: " + highestCost);

        scanner.close();
    }

    public static int findHighestAffordableDestination(int n, int[] amounts) {
        // Calculate the total amount pooled together
        int totalAmount = Arrays.stream(amounts).sum();

        // Calculate the average amount
        double average = (double) totalAmount / n;

        // Sort the amounts in descending order
        Arrays.sort(amounts);
        int highestCost = 0;

        // Check from the highest amount downwards
        for (int i = amounts.length - 1; i >= 0; i--) {
            // If the current amount is less than or equal to the average
            if (amounts[i] <= average) {
                highestCost = amounts[i];
                break; // We found the highest affordable destination
            }
        }

        return highestCost;
    }
}
