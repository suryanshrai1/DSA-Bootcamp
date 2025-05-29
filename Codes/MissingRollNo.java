import java.util.*;

public class MissingRollNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the roll numbers: ");

        String rollString = scanner.nextLine();

        int rollNo[] = Arrays.stream(rollString.split(" ")).mapToInt(Integer::parseInt).toArray();

        int n = rollNo.length;
        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;

        for (int i = 0; i < n - 1; i++) {
            actualSum += rollNo[i];

        }
        long result = expectedSum - actualSum;
        System.out.println("the missing roll number is : ");
        System.out.println(result);

    }

}
