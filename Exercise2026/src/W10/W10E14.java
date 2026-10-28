package W10;

import java.util.Locale;

// An array of objects: the array holds references, and each slot starts as null.
// Put a reference to a real object in a slot before using it; then loop as in Week 6.
class ParcelE14 {
    private final String recipient;
    private final double weightKg;
    private final boolean delivered;

    ParcelE14(String recipient, double weightKg, boolean delivered) {
        this.recipient = recipient;
        this.weightKg = weightKg;
        this.delivered = delivered;
    }

    String getRecipient() {
        return recipient;
    }

    double getWeightKg() {
        return weightKg;
    }

    boolean isDelivered() {
        return delivered;
    }
}

public class W10E14 {
    public static void main(String[] args) {
        ParcelE14[] today = new ParcelE14[4];
        System.out.println("A new array of objects holds: " + today[0]);

        today[0] = new ParcelE14("Aisyah", 1.2, true);
        today[1] = new ParcelE14("Ben", 0.4, false);
        today[2] = new ParcelE14("Chong", 3.5, false);
        today[3] = new ParcelE14("Devi", 2.1, true);

        double total = 0;
        int heaviest = 0, waiting = 0;
        for (int i = 0; i < today.length; i++) {
            total += today[i].getWeightKg();
            if (today[i].getWeightKg() > today[heaviest].getWeightKg()) {
                heaviest = i;
            }
            if (!today[i].isDelivered()) {
                waiting++;
            }
        }
        System.out.println("Total weight: " + String.format(Locale.ROOT, "%.1f", total) + " kg");   // %.1f hides the tiny double error (Week 5)
        System.out.println("Heaviest: " + today[heaviest].getRecipient() + " (" + today[heaviest].getWeightKg() + " kg)");
        System.out.println("Not delivered yet: " + waiting);
    }
}
