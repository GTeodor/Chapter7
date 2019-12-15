import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {



        /* Exercise 1 */

        // Display the sum first 100 numbers higher than 0
        System.out.println("\nThe sum of first 100 numbers is " + Sum.sumOfFirst100() + ".");

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        /* Exercise 2 */

        // Prompt the user to enter the length of the array
        System.out.print("\nEnter the array length: ");
        int[] array = new int[input.nextInt()];

        // Prompt the user to enter the values for the array
        System.out.print("Enter " + array.length +" values for the array: ");

        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }

        // Display the smallest number of the array
        System.out.println("The smallest value of the array is " + Array1.smallestNumber(array));


        /* Exercise 3 */

        // Prompt the user to enter a number
        System.out.print("\nEnter a number (we will prompt the maximum digit of that number): ");
        int userInput = input.nextInt();

        // Display max value
        System.out.println("The maximum digit of number " + userInput + " is " + Max.max(userInput) );

        /* Exercise 4 */

        // Prompt the user to enter a number
        System.out.print("\nEnter a number (we will check if this number is a palindrome): ");
        String userInputPalindrom = input.next();

        // Display result
        System.out.println("The number " + userInputPalindrom + " is" +
                ( Palindrome.isPalindrom(userInputPalindrom)  ? " palindrome" : " not palindrome" ));

        /* Exercise 5 */
        // Prompt the user to enter a number
        System.out.print("\nEnter a number ( we will display all prime numbers below that number): ");
        int userInputPrimeNumbers = input.nextInt();
        PrimeNumbers.printPrimeNumbers(userInputPrimeNumbers);

    }
}
