import java.util.Scanner;

public class PrintDistinctNumbers {
    public static void main(String[] args) {

        java.util.Scanner input = new Scanner(System.in);

        int[] distinctNumbers = new int[10]; // Array of length 10
        int num;                            // User input
        int count = 0;                          // Number of distinct numbers
        System.out.println("Enter ten numbers: ");
        for (int i = 0; i < 10; i++) {
            num = input.nextInt();

            // Test if num is distinct
            if (isDistinct(distinctNumbers, num)) {
                distinctNumbers[count] = num;
                count++;
            }
        }

            System.out.println("The number of distinct number is " + count);
            System.out.println("The distinct numbers are");
            for (int j = 0; j < distinctNumbers.length; j++) {
                if (distinctNumbers[j] > 0)
                    System.out.print(" " + distinctNumbers[j]);
            }

        }


    public static boolean isDistinct(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n)
                return false;
        }
        return true;
    }
}
