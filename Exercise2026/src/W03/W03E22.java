package W03;

// W03E21 fixed: use >= so that each boundary mark (80, 60, 50, 40) gets the higher grade.
// Test the same boundaries again: 39 and 40, 49 and 50, 59 and 60, 79 and 80.
public class W03E22 {
    public static void main(String[] args) {
        int mark = 80;
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
    }
}
