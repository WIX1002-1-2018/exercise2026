package W13;

// finally runs when control leaves the try (and catch) part:
// after a normal finish, before a pending return completes, after a catch,
// and while an exception travels up to the caller.
// Use it for clean-up. A return or throw inside finally would replace the pending result,
// so the advice is: do not return or throw from finally.
public class W13E08 {
    static String label(String weightText) {
        System.out.println("printer on");
        try {
            double w = Double.parseDouble(weightText);     // parsing only; the weight rule is in W13E10
            return "label: " + w + " kg";
        } finally {
            System.out.println("printer off");
        }
    }

    static void labelSafely(String weightText) {
        try {
            System.out.println(label(weightText));
        } catch (NumberFormatException e) {
            System.out.println("not printed: " + e.getMessage());
        } finally {
            System.out.println("next parcel");
        }
    }

    public static void main(String[] args) {
        labelSafely("2.5");
        labelSafely("heavy");
    }
}
