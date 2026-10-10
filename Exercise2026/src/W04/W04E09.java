package W04;

// while tests first, do-while tests last. When the condition is false from the start,
// the while body runs 0 times but the do-while body still runs once.
public class W04E09 {
    public static void main(String[] args) {
        int tickets = 0;
        while (tickets > 0) {
            System.out.println("while: sold one ticket");
            tickets--;
        }
        do {
            System.out.println("do-while: sold one ticket");
            tickets--;
        } while (tickets > 0);
        System.out.println("tickets = " + tickets);   // -1: a ticket was sold that did not exist
    }
}
