package W02;

// Integer overflow: past the largest int, the value wraps around.
public class W02E13 {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        long bad = 1_000_000_000 * 3;     // int maths first, then stored
        long good = 1_000_000_000L * 3;   // L makes it long maths
        System.out.println(bad);
        System.out.println(good);

        // Try it: remove the // below and run. It stops with:
        // ArithmeticException: integer overflow
        // System.out.println(Math.addExact(Integer.MAX_VALUE, 1));
    }
}
