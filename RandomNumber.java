import java.util.Calendar;
import java.util.GregorianCalendar;

public class RandomNumber {
    /** Main method */
    public static void main(String[] args) {

        System.out.println("The number is " + getRandom(5,7));
    }

    /** Method getRandom return a number between 1 and 54 ..*/

    public static int getRandom(int... numbers) {
        int num; // Holds the number to return
        boolean isExcluded;
        do {
            isExcluded = false;
            // Generate a random num between 1 and 54
            num = 1 + (int)(Math.random() * 54);
            for (int e: numbers) {
                if (num == e)
                    isExcluded = true;
            }

        } while (isExcluded);
        return num;
    }


}


