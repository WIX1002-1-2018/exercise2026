package W13;

// The fix for W13E14: catch only NumberFormatException, inside the loop,
// check the weight rule, report each rejected line, and count what was accepted and rejected.
// The result is honest: an accepted subtotal, with the rejected lines named.
public class W13E15 {
    public static void main(String[] args) {
        String[] manifest = {"1.5", "bad", "2.5"};
        double total = 0;
        int accepted = 0, rejected = 0;
        for (int i = 0; i < manifest.length; i++) {
            try {
                double w = Double.parseDouble(manifest[i]);
                if (Double.isFinite(w) && w > 0) {
                    total += w;
                    accepted++;
                } else {
                    rejected++;
                    System.out.println("line " + (i + 1)
                            + " rejected: weight must be finite and greater than 0");
                }
            } catch (NumberFormatException e) {
                rejected++;
                System.out.println("line " + (i + 1)
                        + " rejected: \"" + manifest[i] + "\" is not a number");
            }
        }
        System.out.println(accepted + " accepted, " + rejected + " rejected");
        System.out.println("Accepted subtotal: " + total + " kg");
    }
}
