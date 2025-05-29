import java.util.Scanner;
import java.util.*;

public class MeterSurgeDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of meters: ");
        int n = scanner.nextInt();
        int [] inp = new int[n];
        for (int i = 0; i < inp.length; i++) {
            inp[i] = scanner.nextInt();
        }

        for (int j = 0; j < inp.length; j++) {
            String bin = Integer.toBinaryString(inp[j]);

        }
        
        
    }    
}
