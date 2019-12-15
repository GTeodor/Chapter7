import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {

        // Create a scanner object
        java.util.Scanner input = new java.util.Scanner(System.in);

        // Prompt the user to enter the length of the array
        System.out.print("Enter the length of the array: ");
        int[] myArray = new int[input.nextInt()];
        System.out.print("Enter " + myArray.length + " values:");
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = input.nextInt();
        System.out.println("The array is " + Arrays.toString(myArray));
        System.out.println("The index of the smallest element is " +
                indexOfSmallestElement(myArray));



    }

    /** This method return the index of the smallest element */
    public static int indexOfSmallestElement(int[] array) {
        int min = array[0]; // Holds the min value
        int index = 0; // Holds the index of the min value
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }
}
