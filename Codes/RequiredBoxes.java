import java.util.Scanner;

public class RequiredBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of pujaris: ");
        int n = sc.nextInt();
        // int capacity = 10;
        int count = 0;

        // for (int i = 1; i < n; i++) {
        //     count += i;
        // }

        count = n*(n+1)/2;

        int res = (int) Math.ceil(count / 10.0);

        System.out.println(res);
    }
}
