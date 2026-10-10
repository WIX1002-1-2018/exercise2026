package W04;

// The same task with the three loops: print 3 6 9 12 15.
// Which loop? for: the count is known. while: repeat until something happens (sentinel, target).
// do-while: the body must run at least once (menu, ask then check).
public class W04E13 {
    public static void main(String[] args) {
        int n = 3;
        while (n <= 15) {
            System.out.print(n + " ");
            n += 3;
        }
        System.out.println("(while)");

        n = 3;
        do {
            System.out.print(n + " ");
            n += 3;
        } while (n <= 15);
        System.out.println("(do-while)");

        for (int m = 3; m <= 15; m += 3) {
            System.out.print(m + " ");
        }
        System.out.println("(for)");
    }
}
