package W10;

import java.util.Locale;

// W10E23 fixed. In the constructor, the parameters have the same names as the fields,
// so recipient = recipient; only copied each parameter into itself (the fields stayed null and 0.0).
// VS Code warned about it in W10E23: "The assignment to variable recipient has no effect". Read the warnings.
// this.recipient means the field of this object. A test line checks the result against the expected fee.
class FixedParcelE24 {
    private final String recipient;
    private final double weightKg;

    FixedParcelE24(String recipient, double weightKg) {
        this.recipient = recipient;
        this.weightKg = weightKg;
    }

    double fee() {
        return 5.00 + 2.00 * weightKg;
    }

    public String toString() {
        return recipient + ", " + weightKg + " kg, fee RM " + String.format(Locale.ROOT, "%.2f", fee());
    }
}

public class W10E24 {
    public static void main(String[] args) {
        FixedParcelE24 a = new FixedParcelE24("Aisyah", 1.2);
        FixedParcelE24 b = new FixedParcelE24("Chong", 3.5);
        System.out.println(a);
        System.out.println(b);
        System.out.println("Check: fee for 1.2 kg is RM 7.40? " + (Math.abs(a.fee() - 7.40) < 0.001));
    }
}
