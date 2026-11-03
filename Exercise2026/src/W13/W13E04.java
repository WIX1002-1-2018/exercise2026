package W13;

// Turning text into a number: Double.parseDouble throws NumberFormatException for text
// that is not a number. Careful: "NaN" (not a number) and "Infinity" do parse,
// so a valid weight also needs Double.isFinite(w) && w > 0.
public class W13E04 {
    static boolean validWeight(double w) {
        return Double.isFinite(w) && w > 0;
    }

    public static void main(String[] args) {
        String[] typed = {"1.5", "abc", "", "NaN"};
        for (String t : typed) {
            try {
                double w = Double.parseDouble(t);
                System.out.println("\"" + t + "\" -> " + w + (validWeight(w) ? " (valid)" : " (not a valid weight)"));
            } catch (NumberFormatException e) {
                System.out.println("\"" + t + "\" -> NumberFormatException");
            }
        }
    }
}
