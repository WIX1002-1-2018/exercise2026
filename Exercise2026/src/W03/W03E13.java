package W03;

// Computed decimals can carry rounding error, so 0.1 + 0.2 is not exactly 0.3.
// When "close enough" is what you mean, compare with a small tolerance.
public class W03E13 {
    public static void main(String[] args) {
        double sum = 0.1 + 0.2;
        System.out.println(sum);
        System.out.println(sum == 0.3);
        final double TOLERANCE = 1e-9;          // small enough for this example; choose it per problem
        System.out.println(Math.abs(sum - 0.3) < TOLERANCE);
    }
}
