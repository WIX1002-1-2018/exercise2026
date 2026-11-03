package W10;

import java.util.Locale;

// Why private? A field without private can be changed directly, even to a value that makes no sense.
// (No access word = package-private: any class in W10 can change it; public = any class at all.)
// private hides the field; the only way in is a method that can check the value first.
// A rejected value leaves the old value in place. (protected comes with inheritance in Week 11.)
class OpenParcelE07 {
    double weightKg;                                // any class in W10 can change this

    double fee() {
        return 5.00 + 2.00 * weightKg;
    }
}

class ParcelE07 {
    private double weightKg = 0.5;                  // only methods of ParcelE07 can use it; 0.5 kg if the first value is bad

    ParcelE07(double weightKg) {
        setWeightKg(weightKg);
    }

    void setWeightKg(double weightKg) {             // a mutator (setter) that checks first
        if (weightKg > 0 && weightKg <= 30) {
            this.weightKg = weightKg;
        } else {
            System.out.println("Rejected weight: " + weightKg + " kg (must be more than 0 and at most 30)");
        }
    }

    double getWeightKg() {                          // an accessor (getter)
        return weightKg;
    }

    double fee() {
        return 5.00 + 2.00 * weightKg;
    }
}

public class W10E07 {
    public static void main(String[] args) {
        OpenParcelE07 open = new OpenParcelE07();
        open.weightKg = -5;                         // nothing stops this
        System.out.println("Open parcel fee: RM " + String.format(Locale.ROOT, "%.2f", open.fee()));

        ParcelE07 p = new ParcelE07(1.2);
        p.setWeightKg(-5);                          // checked and rejected
        System.out.println("Weight kept: " + p.getWeightKg() + " kg, fee RM " + String.format(Locale.ROOT, "%.2f", p.fee()));
        // Try it: add  p.weightKg = -5;  and read the compiler message.
    }
}
