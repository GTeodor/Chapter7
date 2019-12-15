import java.util.Arrays;

public class E2 {
    public static void main(String[] args) {

        int[] array1 = {3, 4, 5, 7, 9};


        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
          sum += array1[i];
        }
        System.out.println("For the array " + Arrays.toString(array1));
        System.out.println("The sum is " + sum);
        double average = sum / array1.length;
        System.out.println("Average is " + average);



    }
}
