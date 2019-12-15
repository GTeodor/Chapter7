import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {

        java.util.Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int length = in.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++)
            array[i] = in.nextInt();

        System.out.println("The array is " + Arrays.toString(array));
        System.out.print("Tre reverse of array is ");
        reverse(array);

    }

    public static void reverse(int[] array ) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }

        System.out.print("]");
    }
}
