import java.util.Date;
public class FindSmalestElement {

    public static void main(String[] args) {

        double[] array = {5, 1, 3, 6};
        System.out.print("The min value is " + min(array));

        Date dateCreated = new Date();
        System.out.println("\n" + dateCreated);

    }

    public static double min(double[] array) {

        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}
