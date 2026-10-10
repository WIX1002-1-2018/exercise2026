package W04;

// Try it answer for video #23 (try it yourself first): a countdown must print 5 4 3 2 1, then Lift off!
// Check the first pass (5) and the last pass (1): the test is count >= 1 (count > 1 would stop at 2).
public class W04E23 {
    public static void main(String[] args) {
        for (int count = 5; count >= 1; count--) {
            System.out.print(count + " ");
        }
        System.out.println("Lift off!");
    }
}
