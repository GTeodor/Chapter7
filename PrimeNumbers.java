public class PrimeNumbers {

    /** This method print the prime numbers below a given number */
    public static void printPrimeNumbers(int number) {
        if (number == 1)
             System.out.println("1 is not a prime number.");
        else {
            System.out.print("The prime numbers below " + number + " are: ");
            for (int i = 2; i < number; i++) {
                if (isPrimeNumber(i))
                    System.out.print(i + " ");
            }
        }

    }

    /** This method check if a number is a prime number */
    public static boolean isPrimeNumber(int number) {
        boolean response = true; // We will set the value as true
        for (int i = 2; i < number; i++) {
            if (number % i == 0) // If is true is not a prime number
                response = false;

        }
        return response;

    }
}
