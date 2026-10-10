package W04;

// Trace a loop: write down every variable after every pass. Here the loop prints its own trace table.
// total keeps a running sum (an accumulator): start at 0, add one value per pass.
public class W04E02 {
    public static void main(String[] args) {
        int total = 0;
        int odd = 1;
        System.out.println("odd  total");
        while (odd <= 9) {
            total = total + odd;
            System.out.printf("%3d %6d%n", odd, total);
            odd = odd + 2;
        }
        System.out.println("Sum of the odd numbers 1 to 9 = " + total);
    }
}
