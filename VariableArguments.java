public class VariableArguments {
    /** Main method */
    public static void main(String[] args) {
        System.out.println(printMax(1, 2, 91, 5));

    }

    /** This method prints the max element in an array */
    public static int printMax(int... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed.");
            return 0;
        }
        int result = numbers[0];
        for (int e: numbers) {
            if (result < e)
                result = e;

        }
       return result;
    }
}
