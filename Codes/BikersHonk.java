import java.util.Scanner;

public class BikersHonk {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int interval1= scanner.nextInt();
    int interval2 = scanner.nextInt();
    int journeyTime = scanner.nextInt();

    int result = journeyTime/ lcm(interval1, interval2);
    System.out.println(result);
    scanner.close();
   }

    // if we note the pattern the bikers honk after the LCM interval of both the given intervals
    public static int gcd(int interval1, int interval2){
        while(interval2 != 0){
            int temp = interval2;
            interval2 = interval1 % interval2;
            interval1 = temp;
        }
        return interval1;
    }
    public static int lcm(int interval1, int interval2){
        return (interval1/gcd(interval1, interval2)*interval2);
    }
    
}