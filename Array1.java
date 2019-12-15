public class Array1 {

    /** This method find the smallest number from an array of numbers */
    public static int smallestNumber(int[] array) {
        int smallestNumber = array[0];         // Holds the smallest number
        for (int i = 0; i < array.length; i++) {
            if (smallestNumber > array[i])
                smallestNumber = array[i];
        }
        return smallestNumber;
    }
}
