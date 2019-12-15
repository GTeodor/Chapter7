public class Palindrome {

    /** This method check if a number is Palindom */
    public static boolean isPalindrom(String number) {
        boolean response = true; // We will set the value as true
        for (int i = 0, j = number.length() - 1; i < number.length() / 2; i++, j--) {
            if (number.charAt(i) != number.charAt(j))
                response = false; // If the characters ar not equals the number is not a Palindrom
        }
        if (number.length() == 1) // If the input is a single digit then the number is not a Pa;indrom
            response = false;
        return response;

    }
}
