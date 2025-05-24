import java.util.*;

public class CorrectIncorrectQs {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter the total number of questions: ");
        int totalQs = sc.nextInt();

        System.out.println("Please Enter the score: ");
        int score = sc.nextInt();

        int allCorrect = totalQs * 4;
        int temp = allCorrect - score;

        int incorrect = temp / (5);

        int correct = totalQs - incorrect;

        System.out.print("Total number of incorrect questions: ");
        System.out.println(incorrect);

        System.out.print("Total number of correct questions: ");
        System.out.println(correct);
    }
}