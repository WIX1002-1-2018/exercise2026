package W02;

// Java is case sensitive: total and Total are two different variables.
public class W02E05 {
    public static void main(String[] args) {
        int total = 5;
        int Total = 6;          // legal, but confusing: avoid it
        int totalMarks = 245;   // camelCase for variables
        final int MAX_MARK = 100; // UPPER_CASE for constants
        System.out.println(total + " " + Total);
        System.out.println(totalMarks + " " + MAX_MARK);
    }
}
