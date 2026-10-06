package W03;

// INTENTIONALLY FAULTY (for the AI agent check): a mark of 80 should be grade A, but this prints B.
// Predict first, then test every boundary: 39 and 40, 49 and 50, 59 and 60, 79 and 80.
public class W03E21 {
    public static void main(String[] args) {
        int mark = 80;
        char grade;
        if (mark > 80) {
            grade = 'A';
        } else if (mark > 60) {
            grade = 'B';
        } else if (mark > 50) {
            grade = 'C';
        } else if (mark > 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }
}
