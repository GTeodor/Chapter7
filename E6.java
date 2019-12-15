import java.util.*;
public class E6 {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner in = new Scanner(System.in);
        // Prompt the user to enter the length of an array
        System.out.print("Enter the length of an array: ");
        int[] myArray = new int[in.nextInt()];
        // Set the values for the array
        System.out.println("Enter " + myArray.length + " elements of array");
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = in.nextInt();
        }
        System.out.println("Enter a number: ");
        int number = in.nextInt();

        // Print array
        System.out.println("The array values are: " + Arrays.toString(myArray));
        if (containsIndex(myArray, number) == true)
            System.out.println("The index for number " + number + " is " + findIndex(myArray, number));
        else
            System.out.println("The array not contain the number " + number);
    }

    public static boolean containsIndex(int[] myArray, int number) {
        boolean response = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray [i] == number)
                response = true;
        }
        return response;
    }

    public static int findIndex(int[] myArrays, int number) {
        int index = 0;
        for (int i = 0; i < myArrays.length; i++) {
            if (myArrays[i] == number)
                index = i;
        }
        return index;
    }


}
