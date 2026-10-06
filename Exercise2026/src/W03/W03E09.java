package W03;

import java.util.Scanner;

// Grade from a mark: the first true condition wins, so test from the highest grade down.
// Assumes a valid mark from 0 to 100 (W03E19 shows how to check the input first).
public class W03E09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Mark (0 to 100): ");
        int mark = in.nextInt();
        char grade;
        if (mark >= 80) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
        // Test both sides of every boundary: 39 and 40, 49 and 50, 59 and 60, 79 and 80.
        // Try it: move the "mark >= 40" test to the top. Why does a mark of 95 now get D?
    }
}
