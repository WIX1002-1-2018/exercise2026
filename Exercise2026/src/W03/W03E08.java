package W03;

// Separate if statements are all tested; an else-if chain stops at the first true test.
public class W03E08 {
    public static void main(String[] args) {
        int points = 95;

        // Separate ifs: every true condition runs (two lines printed).
        if (points >= 90) {
            System.out.println("Gold badge");
        }
        if (points >= 50) {
            System.out.println("Silver badge");
        }

        // else-if chain: only the first true branch runs (one line printed).
        if (points >= 90) {
            System.out.println("Gold badge");
        } else if (points >= 50) {
            System.out.println("Silver badge");
        }
    }
}
