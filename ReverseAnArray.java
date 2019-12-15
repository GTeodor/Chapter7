public class ReverseAnArray {
    /** Main method */
    public static void main(String[] args) {

        // Create a scanner object
       java.util.Scanner input = new java.util.Scanner(System.in);

       // Prompt the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int[] x = new int[input.nextInt()];

        // Prompt the user to enter the values for the array
        System.out.print("Enter " + x.length + " values: " );
        for (int i = 0; i < x.length; i++)
            x[i] = input.nextInt();

        reverse(x); // Reverse the array x

        // Display the array
        System.out.print("The array is: ");
        //printArray(x);
          for (int e: x)
            System.out.print(e + " ");
    }

    /** This method reverse an array */
    public static void reverse (int[] array) {
        int temp = 0;
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

    }

    /** This method display an array*/
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
}
