package W13;

// AI check: this method was written by an AI assistant. It compiles and finishes without showing an exception.
// An exception does happen: the empty catch swallows it, and because the try is around the whole loop,
// the rest of the loop (including the valid "2.5") is abandoned.
// (Intentionally faulty: see W13E15 for the fix.)
public class W13E14 {
    // "Add up the weights in the manifest and ignore any problems."
    static double totalWeight(String[] lines) {
        double total = 0;
        try {
            for (String line : lines) {
                total += Double.parseDouble(line);
            }
        } catch (Exception e) {
        }
        return total;
    }

    public static void main(String[] args) {
        String[] manifest = {"1.5", "bad", "2.5"};
        System.out.println("Total: " + totalWeight(manifest) + " kg");
    }
}
