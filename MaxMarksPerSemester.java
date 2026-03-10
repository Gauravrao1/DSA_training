
//Q-3 Find maximum marks in each semester
//Logic: Use 2D array, loop through each semester's marks and track max
import java.util.Scanner;

public class MaxMarksPerSemester {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter no of semester: ");
                int sem = sc.nextInt();

                int[] subjectsCount = new int[sem];
                for (int i = 0; i < sem; i++) {
                        System.out.print("Enter no of subjects in " + (i + 1) + " semester: ");
                        subjectsCount[i] = sc.nextInt();
                }

                for (int i = 0; i < sem; i++) {
                        System.out.print("Marks obtained in semester " + (i + 1) + ": ");
                        int max = -1;
                        for (int j = 0; j < subjectsCount[i]; j++) {
                                int mark = sc.nextInt();
                                if (mark < 0 || mark > 100) {
                                        System.out.println("You have entered invalid mark.");
                                        return;
                                }
                                if (mark > max)
                                        max = mark;
                        }
                        System.out.println("Maximum mark in " + (i + 1) + " semester: " + max);
                }
                sc.close();
        }
}
