import java.util.Scanner;
public class AssignGrades {

    /** Main class */
    public static void main(String[] args) {

        //Create a scanner object
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int [] numberOfStudents = new int[input.nextInt()];
        char [] grades = new char [numberOfStudents.length];

        System.out.println("Enter "+ numberOfStudents.length + " scores: ");
         for (int i = 0; i < numberOfStudents.length; i++)
            numberOfStudents[i] = input.nextInt();

       // System.out.println("The highest score is " + bestScore(numberOfStudents));


     /*   System.out.print("Number of student ");
        printArray(numberOfStudents); */


    }

    public static void printArray(int [] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }

    public static int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if (max < array[i])
                max = array[i];

        return max;
    }

   // public static void getGrade(int score)

}
