public class AverageAnArray {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the length of the array: ");
        int[] array = new int[input.nextInt()];

        System.out.print("Enter " + array.length + " values ");
        for (int i = 0; i < array.length; i++)
            array[i] = input.nextInt();

        System.out.println("Average is " + average(array));

    }

    public static int average(int[] array) {

        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum/array.length;
    }

    public static double average(double[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i];
        return sum/array.length;
    }


}

