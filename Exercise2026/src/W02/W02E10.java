package W02;

// Compound assignment (+=) converts the result back to the variable's type.
public class W02E10 {
    public static void main(String[] args) {
        int total = 0;
        total += 70;
        total += 85;
        System.out.println("total = " + total);

        int n = 5;
        n += 2.5;      // works: n = (int) (n + 2.5)
        System.out.println("n = " + n);

        // Try it: remove the // below and compile. javac says:
        // incompatible types: possible lossy conversion from double to int
        // n = n + 2.5;
    }
}
