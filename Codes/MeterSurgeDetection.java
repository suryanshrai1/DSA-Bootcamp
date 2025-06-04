import java.util.Scanner;

public class MeterSurgeDetection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of meters: ");
        int n = scanner.nextInt();
        int [] inp = new int[n];
        System.out.println("Enter the status codes(in number): ");
        for (int i = 0; i < n; i++) {
            inp[i] = scanner.nextInt();
        }
        scanner.close();
        
        int count = 0;
        for (int j = 0; j < inp.length; j++) {
            int num = inp[j];
            if((num &(1<<2)) != 0){
                count++;
            }

        }
        System.out.println("Number of meters with tempering attempt: "+ count);

    }    
}
