import java.sql.PreparedStatement;
import java.util.Arrays;
import java.util.Scanner;

public class E5 {
    public static void main(String[] args) {

        int[] myArray1= {1789, 2035, 1899, 1456, 2013};
        java.util.Scanner in = new Scanner(System.in);
        System.out.print("Enter an element: ");
        int element = in.nextInt();
        System.out.println("My array is " + Arrays.toString(myArray1));
        System.out.println("My array contains the element " + element +
                " ? " + ((contains(myArray1, element) == true) ? " Yes" : " No"));
    }



    public static boolean contains(int[] myArray, int n) {
        boolean response = false;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == n)
                response = true;
        }

        return response;
    }
}
