public class Sum {

    /** This method compute the sum of first 100 numbers higher than 0  */
    public static int sumOfFirst100() {
        int sum = 0;    // Holds the sum of the next iteration
        for (int i = 1; i < 101; i++) {
            sum += i;
        }
        return sum;
    }

}
