package W10;

// Why classes? Three parcels kept in three parallel arrays (the Week 6 way).
// The facts about one parcel sit in different arrays, joined only by the index.
// A new fact (say, a phone number) means a new array, and every change must touch all of them.
public class W10E01 {
    public static void main(String[] args) {
        String[] recipient = {"Aisyah", "Ben", "Chong"};
        double[] weightKg = {1.2, 0.4, 3.5};
        boolean[] delivered = {false, true, false};

        System.out.println("Three parcels in three arrays:");
        for (int i = 0; i < recipient.length; i++) {
            System.out.println("  " + recipient[i] + ", " + weightKg[i] + " kg, delivered: " + delivered[i]);
        }

        // Sort by weight? Every array must be swapped together. Swap only the weights by mistake:
        double temp = weightKg[0];
        weightKg[0] = weightKg[2];
        weightKg[2] = temp;

        System.out.println("After swapping only the weights:");
        for (int i = 0; i < recipient.length; i++) {
            System.out.println("  " + recipient[i] + ", " + weightKg[i] + " kg, delivered: " + delivered[i]);
        }
        System.out.println("Aisyah's parcel now shows Chong's weight: the arrays no longer match.");
    }
}
