package W13;

// Try it answer for video #68 (try it yourself first): average daily steps from a log
// with one bad line. Catch inside the loop, report the line, count accepted and rejected,
// and average only the accepted days.
public class W13E29 {
    public static void main(String[] args) {
        String[] log = {"4500", "n/a", "6200"};
        int total = 0, accepted = 0, rejected = 0;
        for (int i = 0; i < log.length; i++) {
            try {
                int steps = Integer.parseInt(log[i]);
                if (steps >= 0) {
                    total += steps;
                    accepted++;
                } else {
                    rejected++;
                    System.out.println("line " + (i + 1) + " rejected: negative steps");
                }
            } catch (NumberFormatException e) {
                rejected++;
                System.out.println("line " + (i + 1) + " rejected: \"" + log[i] + "\"");
            }
        }
        System.out.println(accepted + " accepted, " + rejected + " rejected");
        System.out.println("Average: " + (accepted > 0 ? total / accepted : 0) + " steps");
    }
}
