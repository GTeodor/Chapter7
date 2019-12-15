import java.util.Scanner;

public class AnalyzeScores {
    /** Main method */
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.in);

        // Prompt the user to enter an scores
        System.out.println("Enter scores (negative numbers signifies end): ");

        int[] scores = new int[100]; // Initialize score array
        int num;                     // Hold user input
        int numberOfScore;           // Hold number of score
        int average;                 // Hold average score
        numberOfScore = average = 0; // Initialize accumulator to 0

        for (int i = 0; i < 100; i++) {
            num = input.nextInt();
            if (num < 0)
                break;              // A negative number signifies end

            scores[i] = num;        // fill score array
            average += num;         // Add score to average
            numberOfScore++;        // Increment number of scores
        }

        average /= numberOfScore;

        int aboveOrEqual;           // Holds score above or equal to average
        int below;                  // Scores below average
        aboveOrEqual = below = 0;   // Initialize accumulator to 0;

        for (int i = 0; i < numberOfScore; i++) {
            if (scores[i] >= average)
                aboveOrEqual++;
            else
                below++;
        }

        // Display results
        System.out.println("\nAverage of scores: " + average);
        System.out.println("Number of score above or equal to average: " + aboveOrEqual);
        System.out.println("Number of scores below average " + below);



    }
}
