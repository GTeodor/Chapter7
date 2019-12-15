public class Max {
    /** This method find the max digit from a number */
    public static int max(int number) {
        String x = Integer.toString(number);
        char max = x.charAt(0);                 // Holds the max value
        for (int i = 1; i < x.length(); i++) {
            if (max < x.charAt(i))
                max = x.charAt(i);
        }

        return Character.getNumericValue(max);
    }
}
