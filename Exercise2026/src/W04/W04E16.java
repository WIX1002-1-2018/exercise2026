package W04;

// INTENTIONALLY FAULTY: two loop bugs that compile and run. Predict the output, run, then fix.
public class W04E16 {
    public static void main(String[] args) {
        // Bug 1: a semicolon after the for header. The ; is the empty body, so the loop
        // repeats nothing 3 times; the block below is not part of the loop and runs once.
        for (int i = 1; i <= 3; i++); {
            System.out.println("Hello");
        }

        // Bug 2: the running total is reset inside the loop, so it keeps only the last value.
        int total;
        for (int day = 1; day <= 3; day++) {
            total = 0;
            total = total + 10;
            System.out.println("Day " + day + ": total = " + total);
        }
        // Fix: int total = 0; before the loop, and only total = total + 10; inside it.
    }
}
