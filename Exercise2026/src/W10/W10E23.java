package W10;

import java.util.Locale;

// INTENTIONALLY FAULTY (for the AI agent check): an AI agent wrote this class. It compiles and runs,
// but every parcel prints as null and 0.0 kg, and the fee is always RM 5.00. Find the bug. (Fixed in W10E24.)
class AiParcelE23 {
    private String recipient;
    private double weightKg;

    AiParcelE23(String recipient, double weightKg) {
        recipient = recipient;
        weightKg = weightKg;
    }

    double fee() {
        return 5.00 + 2.00 * weightKg;
    }

    public String toString() {
        return recipient + ", " + weightKg + " kg, fee RM " + String.format(Locale.ROOT, "%.2f", fee());
    }
}

public class W10E23 {
    public static void main(String[] args) {
        AiParcelE23 a = new AiParcelE23("Aisyah", 1.2);
        AiParcelE23 b = new AiParcelE23("Chong", 3.5);
        System.out.println(a);
        System.out.println(b);
    }
}
