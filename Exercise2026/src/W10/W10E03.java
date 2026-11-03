package W10;

import java.util.Locale;

// Methods in a class: an instance method works on the object it is called on.
// a.fee() uses a's weight; b.fee() uses b's weight. Same method, different objects.
// String.format(Locale.ROOT, "%.2f", x): two decimals, always with a dot, whatever the computer's language (as in Week 9).
class ParcelE03 {
    String recipient;
    double weightKg;

    double fee() {                                  // RM 5.00 plus RM 2.00 for each kg
        return 5.00 + 2.00 * weightKg;
    }

    String describe() {
        return recipient + ", " + weightKg + " kg, fee RM " + String.format(Locale.ROOT, "%.2f", fee());
    }
}

public class W10E03 {
    public static void main(String[] args) {
        ParcelE03 a = new ParcelE03();
        a.recipient = "Aisyah";
        a.weightKg = 1.2;

        ParcelE03 b = new ParcelE03();
        b.recipient = "Chong";
        b.weightKg = 3.5;

        System.out.println(a.describe());
        System.out.println(b.describe());
    }
}
