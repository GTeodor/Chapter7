import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class UsefulMethods {
    public static void main(String[] args) {
        /* String[] array = {"red", "green", "blue"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(array));
        for (String e: list) {
            System.out.print(e + " ");
        }
        String[] array1 = new String[list.size()];
        list.toArray(array1); */

        Integer[] array = {31, 5, 95, 4, 15, 34, 3, 6, 5};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        Collections.sort(list);
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        Collections.shuffle(list);
        System.out.println(list);


    }
}
